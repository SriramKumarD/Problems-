//Find the minimum difference element in a sorted array
public class LeastDifferenceInArray {
	
	private static Integer findLeastDifferenceElement(int[] array, int target) {
		int n = array.length;
		if (target < array[0]) {
			return array[0]; 
		}
		if (target > array[n -1]) {
			return array[n -1];
		}
		
		int left = 0, right = n-1;
		
		while (left <= right) {
			int mid = (left+right)/2;
			
			if (target == array[mid]) {
				return array[mid];
			}
			if (target > array[mid]) {
				left = mid+1;
			}
			if (target < array[mid]) {
				right = mid-1;
			}
		}
		if ((array[left] - target) < (target - array[right]))
            return array[left];
        return array[right];
		
		
	}

	public static void main(String[] args) {
		
		int array[] = { 2, 5, 10, 12, 15 };
		int target = 11;
		
		System.out.println(findLeastDifferenceElement(array, target));

	}

}
