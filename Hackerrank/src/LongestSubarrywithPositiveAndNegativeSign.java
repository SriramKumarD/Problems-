

//https://www.geeksforgeeks.org/length-of-the-longest-alternating-subarray/
public class LongestSubarrywithPositiveAndNegativeSign {
	
	private static Integer findMaxSubarry(int[] arr) {
		
		int count = 1; 
		String a= "a";
		Object a1;
		int maxLength = 1;
		for (int i =1; i<arr.length; i++) {
			if(arr[i] * arr[i-1] < 0) {
				count ++;
			}
			else {
				if (count > maxLength) {
					maxLength = count;
				}
				count = 1;
			}
			
		}
		if (count > maxLength) {
			maxLength = count;
		}

		return maxLength;
	}

	public static void main(String[] args) {

		int arr[] = { 1, -5, 1, -5 };
		
		System.out.println("Longest Subarray : " +findMaxSubarry(arr));
	}

}
