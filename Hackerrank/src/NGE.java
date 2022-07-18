import java.util.Stack;

//Next Greater element 
public class NGE {
	
	private static void printNGE(int[] arr, int n) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int next, element;
		
		stack.push(arr[0]);
		
		for (int i=1; i<n; i++) {
			
			next = arr[i];
			if(stack.isEmpty() == false) {
				element = stack.pop();
				while(element < next) {
					System.out.println(element+" :" + next);
					if(stack.isEmpty()) {
						break;
					}
					element = stack.pop();
				}
				if(element > next) {
					stack.push(element);
				}
			}
			stack.push(next);
		}
		
		while (stack.isEmpty() == false)
        {
            element = stack.pop();
            next = -1;
            System.out.println(element + " :" + next);
        }
		
	}

	public static void main(String[] args) {
		
		int arr[] = { 11, 13, 3, 21 };
        int n = arr.length;
        printNGE(arr, n);

	}

	

}
