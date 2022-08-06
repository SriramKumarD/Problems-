import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonrepeatingChar {
	
	static LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	
	private static void nonrepeatingChar(String str) {
		
		for (Character c : str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
	}

	public static void main(String[] args) {
		
		String str = "sriramkumar";
		
		nonrepeatingChar(str);
		
		for (Character c : map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println("Char " +c);
				break;
			}
		}
		
		
	}
}
