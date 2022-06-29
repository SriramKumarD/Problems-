import java.util.HashMap;
import java.util.Map;

public class LargestSubarraywithZeroSum {

	public static void main(String[] args) {

	Integer	arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
	
	System.out.println("LargestdSubarraywithSumZero : "+LargestdSubarraywithSumZero(arr));

	}

	private static Integer LargestdSubarraywithSumZero(Integer[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max=0;
		int sum=0;
		
		for(int i=0; i<arr.length; i++ ) {
			sum+=arr[i];
			if(sum == 0) {
				max = i+1;
			}
			else {
				if(map.get(sum) != null) {
					max = Math.max(max, i-map.get(sum));
				}
				else {
					map.put(sum, i);
				}
			}
		}
		return max;
	}

}
