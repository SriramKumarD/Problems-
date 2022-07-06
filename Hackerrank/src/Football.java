import java.util.ArrayList;
import java.util.List;

public class Football {

	public static void main(String[] args) {
	
		Integer[] teamA = {1,4,2,4};
		
		Integer[] teamB = {2,3};
		
		int aLength = teamA.length;
		int bLength = teamB.length;
		
		List<Integer> result = new ArrayList<Integer>();
		int count = 0;
		for(int i=0; i<bLength; i++) {
			count = 0;
			int score = teamB[i];
			for(int j =0 ; j<aLength; j++) {
				if(teamA[j] <= score) {
					count ++;
				}
			}
			result.add(count);
		}
		
		System.out.println(result);

	}

}
