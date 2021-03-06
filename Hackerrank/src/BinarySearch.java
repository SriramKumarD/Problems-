
public class BinarySearch {
	
	//recursive and iterative method solution
	
	//(i) First occurance of the element
	private static Integer binarySearch(int[] arr, int key, int left, int right) 
	{
		/*
		 * int left = 0; int right = arr.length -1;
		 */
		while (left <= right) {
			
			int mid = left + (right - left)/2;
			
			if(key == arr[mid]) {
				return mid;
			}
			else if(key < arr[mid]) {
				right = mid-1;
				//binarySearch(arr, key, left, right);
			}
			else {
				left = mid+1;
				//binarySearch(arr, key, left, right);
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
        int arr[] = { 2, 3, 4, 10, 40 };
        int key = 10;
        System.out.println("Binary Search :" +binarySearch(arr,key, 0, arr.length-1));
        
	}


}
