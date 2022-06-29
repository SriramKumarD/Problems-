import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Longestsubarrayhavingsumk {

	public static void main(String[] args) {
		
		int[] arr = { 10, 5, 2, 7, 1, 9 };
		int k =15;
		
		System.out.println("LongestSubarrayHavingSumK::"+LongestSubarrayHavingSumK(arr, k));
	}

	private static Integer LongestSubarrayHavingSumK(int[] arr, int k) {
		
		int sum = 0;
		int result = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(sum == k) {
				result = i+1;
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			if(map.containsKey(sum-k)) {
				if (result < i-map.get(sum-k)) {
					result = i-map.get(sum-k);
				}
			}
		}
		return result;
	}

}
