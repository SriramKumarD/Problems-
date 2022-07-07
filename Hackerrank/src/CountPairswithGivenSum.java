import java.util.HashMap;
import java.util.Map;

public class CountPairswithGivenSum {
	
	private static Integer pairsCount(int[] arr, int sum) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			
			if(map.containsKey(sum -arr[i])) {
				count+= map.get(sum-arr[i]);
			}
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
	
		int arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
	    int sum =11;
	    System.out.print("Count of pairs is "
	         + pairsCount(arr,sum));
	}

	}
