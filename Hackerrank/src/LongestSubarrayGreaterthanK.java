//Longest subarray in which all elements are greater than K

public class LongestSubarrayGreaterthanK {

	public static void main(String[] args) {
		
		int[] array = {8, 25, 10, 19, 19, 18, 20, 11, 18};
		int k = 10 ;
		System.out.println("LongestSubarrayGreaterthanK ::"+longestSubarrayGreaterthanK(array, k));
	}

	private static Integer longestSubarrayGreaterthanK(int[] array, int k) {
		
		int length = 0;
		int count = 0;
		for (int i=0; i<array.length; i++) {

			if(array[i] > k) {
				count++;
			}
			else {
				length = Math.max(count, length);
				count = 0;
			}
		}
		if(count > 0) {
			length = Math.max(count, length);
		}
		return length;
	}

}
