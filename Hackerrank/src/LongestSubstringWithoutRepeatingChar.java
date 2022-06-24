import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		
		System.out.println(longestSubstring(str));
	}

	private static int longestSubstring(String str) {

		int a_pointer = 0;
		int b_pointer = 0;
		int max = 0;
				
		Set<Character> hashSet = new HashSet<Character>();
		while(b_pointer < str.length()) {
			if(!hashSet.contains(str.charAt(b_pointer))) {
				hashSet.add(str.charAt(b_pointer));
				b_pointer++;
				max = Math.max(hashSet.size(), max);
			}
			else {
				hashSet.remove(str.charAt(a_pointer));
				a_pointer++;
			}
		}
		return max;
	}

}
