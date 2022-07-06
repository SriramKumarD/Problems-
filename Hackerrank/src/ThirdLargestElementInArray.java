
public class ThirdLargestElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {11, 23, 1, 20, 24, 26};
		
		System.out.println("Third Largest element in Array : "+findThirdLargestElement(arr));

	}

	private static Integer findThirdLargestElement(int[] arr) {
		
		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		
		if (arr.length < 3) {
			System.out.println("The array length is less than 3");
			return 0;
		}
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second) {
				third = second;
				second = arr[i];
			}
			else if(arr[i] > third) {
				third = arr[i];
			}
		}
		
		return third;
	}

}
