import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombination {
	
	static final Map<Character,String> map = new HashMap<Character,String>() {{
        put('1', "");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "");
    }} ;
    
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        List<String> preres = new ArrayList<String>();
        res.add("");

        for(int i = 0; i < digits.length(); i++) {
            String letters = map.get(digits.charAt(i));
            if (letters.length() == 0)
                continue;
            for(String str : res) {
                for(int j = 0; j < letters.length(); j++)
                    preres.add(str + letters.charAt(j));
            }
            res = preres;
            preres = new ArrayList<String>();
        }      
        return res;
    }
    
	public static void main(String[] args) {
		
		System.out.println("Combinations: "+letterCombinations("32"));
	}

}
