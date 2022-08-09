
public class reverseStringUsingRecursion {
	
	private static void reverseString(String str) {
		
		if(str.length() == 0 || str.isEmpty()) {
			System.out.println(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			reverseString(str.substring(0, str.length()-1));
		}
		
	}

	public static void main(String[] args) {
		
		String str = "SriramKumar";
		
		reverseString(str);
		

	}

}
