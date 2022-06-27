
public class maximumSumofcontigousSubarray {

	public static void main(String[] args) {

		int [] array = {-2, -3, 4, -1, -2, 1, 5, -3};
			
		System.out.println("MaximumSumSubarray :"+findMaxSumSubarray(array));

	}

	private static Integer findMaxSumSubarray(int[] array) {
		
		int sum = 0;
		int max = array[0];
		
		for(int i = 0; i< array.length; i++) {
			sum+=array[i];
			if(sum > max) {
				max = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return max;
	}

}
