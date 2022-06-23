import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		
		Integer[] arr = {4,3,2,7,8,2,3,1};
		
		list = Arrays.asList(arr);
		
		for(int i=1; i <= 8; i++) {
			if(!list.contains(i)) {
				list1.add(i);
			}
		}
		System.out.println(list1);
 		

	}

}
