
//https://www.geeksforgeeks.org/find-the-farthest-smaller-number-in-the-right-side/

class FarthestElementInTheRightSide {

	// Function to find the farthest
	// smaller number in the right side
	static void farthest_min(int[] a, int n)
	{
		
		int[] suffix_min = new int[n];

		suffix_min[n - 1] = a[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			suffix_min[i]
				= Math.min(suffix_min[i + 1], a[i]);
		}

		for (int i = 0; i < n; i++) {
			int low = i + 1, high = n - 1, ans = -1;

			while (low <= high) {
				int mid = (low + high) / 2;

				// If current element in the suffix_min
				// is less than a[i] then move right
				if (suffix_min[mid] < a[i]) {
					ans = mid;
					low = mid + 1;
				}
				else
					high = mid - 1;
			}

			// Print the required answer
			System.out.print(ans + " ");
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] a = { 3, 1, 5, 2, 4 };
		int n = a.length;

		farthest_min(a, n);
	}
}

