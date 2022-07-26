import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistanceClosesZero {
	
	private static void printDistance(List<Integer> list, int n) {

		for (int i=0; i<list.size(); i++) {
			System.out.println(Math.abs(i - list.indexOf(0)));
		}
	}

	public static void main(String[] args) {
		
		Integer a[] = { 2, 1, 0, 3, 1, 2, 0, 2, 4 };
		
		List<Integer> list = Arrays.asList(a);
		
		//Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(s -> list.indexOf(s), i->i));
		
        int n = a.length;
        printDistance(list, n);

	}

}
