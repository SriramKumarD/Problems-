import java.util.Arrays;

public class AnagramCheck {
	
	private static boolean isAnagaram(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		
		String s1 = "testing";
		String s2 = "gestigt";
		
		System.out.println("Anagram : " +isAnagaram(s1,s2));

	}


}
