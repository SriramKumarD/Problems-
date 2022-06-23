
public class sorting0s1s2s {

	public static void main(String[] args) {
		
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        sorting012(arr, arr_size);
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);

	}

	private static void printArray(int[] arr, int arr_size) {
		int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        	System.out.println("");
		
	}

	private static void sorting012(int[] arr, int arr_size) {
		int low = 0; 
		int mid = 0;
		int high = arr_size -1;
		int temp = 0;
		
		while (mid <= high) {
			if(arr[mid] == 0) {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++;
				low++;
			}
			if(arr[mid] == 1) {
				mid ++;
			}
			if(arr[mid] == 2) {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high --;
		}
		
	}
	}
}
