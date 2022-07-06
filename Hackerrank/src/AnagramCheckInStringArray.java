
public class AnagramCheckInStringArray {
	
	/*
	 * String arr[] = {"testing","geeksquiz", "geeksforgeeks", "abcd",
	 * "forgeeksgeeks", "zuiqkeegs", "etsting", "tetsing"};
	 */
	static int NO_OF_CHARS = 256;
	private static void findAllAnagramInArray(String[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(isAnagram(arr[i], arr[j])) {
					System.out.println(arr[i]+" Anagrams are :"+arr[j]);
				}
			}
		}
		
		
	}

	private static boolean isAnagram(String string, String string2) {
		
		int[] count = new int[NO_OF_CHARS];
		for(int i=0; i<string.length() && i < string2.length(); i++) {
			count[string.charAt(i)]++;
			count[string2.charAt(i)]--;
		}
		if(string.length() != string2.length()) {
			return false;
		}
		for (int i = 0; i < NO_OF_CHARS; i++)
	        if (count[i] != 0)
	            return false;
	     return true;
	}

	public static void main(String[] args) {
		
		String arr[] = {"testing","geeksquiz", "geeksforgeeks",
                "abcd", "forgeeksgeeks",
                "zuiqkeegs", "etsting", "tetsing"};
		
		findAllAnagramInArray(arr);

	}

}
