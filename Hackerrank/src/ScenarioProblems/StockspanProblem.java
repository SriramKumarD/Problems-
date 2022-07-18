package ScenarioProblems;

import java.util.Stack;

//https://www.geeksforgeeks.org/the-stock-span-problem/
public class StockspanProblem {
	
	private static void calculateSpanArray(int[] price, int n, int[] span) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		span[0] = 1;
		
		for(int i= 1; i<n; i++) {
			
			while(!stack.isEmpty() && price[stack.peek()] <= price[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				span[i] = i+1;
			}
			else {
				span[i] = i - stack.peek();
			}
			stack.push(i);
		}
		
		for (int i =0; i<span.length; i++) {
			if(i != span.length -1)
				System.out.print(span[i]+ ",");
			else
				System.out.print(span[i]);	
		}
	}

	public static void main(String[] args) {
		
		int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int span[] = new int[n];

        calculateSpanArray(price, n, span);
	}

}
