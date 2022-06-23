import java.util.Arrays;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,4,5,6,8,9};
		
		List<Integer> list = Arrays.asList(array);
		
		for(int i=1; i<=9; i++) {
			if(!list.contains(i)) {
				System.out.print(i);
			}
		}

	}

}
