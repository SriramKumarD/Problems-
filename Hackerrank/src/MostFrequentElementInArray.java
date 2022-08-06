import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementInArray {
	
	private static Integer findMostFrequentElement(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxCount = 0;
		int mostFreqentElement = 0;
		for (int i=0; i<arr.length; i++) {
			int key = arr[i];
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}
		}
		
		for (Integer key : map.keySet()) {
			int k = map.get(key);
			if(k > maxCount) {
				maxCount = k;
				mostFreqentElement = key;
			}
		}
		
		return mostFreqentElement;
		
	}
	

	private static Integer findMostFrequentElementUsingMorries(int[] arr) {
		int res = 0;
		int count = 1;
		for (int i=1; i<arr.length; i++) {
			if(arr[i] == arr[res]) {
				count++;
			}
			else {
				count--;
			}
			if(count == 0) {
				res = i;
				count = 1;
			}
		}
		
		return arr[res];
	}

	public static void main(String[] args) {
		
		int arr[] = {10,40,10,30,10,10,40,10,30,30,10};
		
		//Hashing solution
		System.out.println("Most Freqent element :"+findMostFrequentElement(arr));
		
		//Morries Algo. This algo only works when the max occuring element is more than sizearray/2 times
		System.out.println("Most Freqent element :"+findMostFrequentElementUsingMorries(arr));

	}


}
