import java.util.Stack;

public class AdjusentCharRemoval {
	
	private static String adjusentCharRemoval(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : str.toCharArray() ) {
			if(!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			}
			else {
				stack.push(c);
			}
		}
		StringBuilder strb = new StringBuilder();
		while(!stack.isEmpty()) {
			strb.append(stack.pop());
		}
		
		return strb.reverse().toString();
		
	}

	public static void main(String[] args) {
	
		String str = "CVBBVDV";
		
		System.out.println(adjusentCharRemoval(str));

	}

}
