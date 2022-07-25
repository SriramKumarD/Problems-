
public class BinarySearchFirstLastOccurance {
	
	//recursive and iterative method solution
	
	//(i) First occurance of the element
	private static Integer binarySearch(int[] arr, int key) 
	{
	
		int left = 0; int right = arr.length -1;
		
		int result = -1;
		
		while (left <= right) {
			
			int mid = (left+right)/2;
			
			if(key == arr[mid]) {
				result = mid;
				right = mid -1;  //First Occurance
				//left = mid+1; //Last Occurance
			}
			else if(key < arr[mid]) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
        int arr[] = { 2, 2, 2, 3, 4, 4, 40 };
        int key = 40;
        System.out.println("Binary Search :" +binarySearch(arr, key));
        
	}


}
