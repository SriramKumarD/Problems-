
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
public class MaximumConsecutiveOne {

	public static void main(String[] args) {
		
		int[] array = {1,1,0,1,1,0,1,1};

		System.out.println("MaximumConsecutiveOne: "+maximumConsecutiveOnes(array));
	}

	private static Integer maximumConsecutiveOnes(int[] array) {
		
		int count = 0;
		int result = 0;
		
		for (int i=0; i<array.length; i++) {
			
			if(array[i] == 0) {
				count = 0;
			}
			else {
				count++;
				result = Math.max(result, count);
			}
		}
		
		return result;
	}

}
