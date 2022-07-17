import java.util.Stack;

public class NearestSmallerElementInleftSideofArray {
	
	private static void findNearestElementInLeftSideOfArray(int[] arr, int length) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<length; i++) {
			
			while(!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				System.out.println("-1");
			}
			else {
				System.out.println(stack.peek());
			}
			stack.push(arr[i]);
		}
	}


	public static void main(String[] args) {
		
		int arr[] = {1, 3, 4, 6, 5};
		
		findNearestElementInLeftSideOfArray(arr, arr.length);

	}
}
