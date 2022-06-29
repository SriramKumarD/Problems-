//Find the row with maximum number of 1s

public class MaximumNumberof1sInRow {
	static int count = 0;
	public static void main(String args[]) {
		
		int mat[][] = { {0, 0, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 0, 1},
                {0, 0, 0, 0}};
		
		System.out.print("Index of row with maximum 1s is " + rowWithMax1s(mat));
	}

	private static Integer rowWithMax1s(int[][] mat) {
		
		for (int i =0; i<mat.length; i++) {
			maximumNumber(mat[i]);
		}
		return count;
	}

	private static void maximumNumber(int[] is) {
		int countRow=0;
		for (int i=0; i<is.length; i++) {
			if(is[i] == 1) {
				countRow++;
			}
		}
		if(countRow > count) {
			count = countRow;
		}
		
	}
}
