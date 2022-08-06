import java.util.Arrays;

//Find smallest Interval
public class findSmallestElement {
	
	private static Integer findSmallestInterval(int[] arr) {
		
		Arrays.sort(arr);
		Integer diff = Integer.MAX_VALUE;
		
		for (int i=0; i<arr.length-1; i++) {
			if(arr[i+1] - arr[i] < diff ) {
				diff = arr[i+1] - arr[i];
			}
		}
		
		return diff;
	}

	public static void main(String[] args) {
		
		int arr[] = {7, 5, 3, 19, 18, 25};
		
		System.out.println("SmallestInterval : "+findSmallestInterval(arr));
	}

}
