

//Find the maximum value in each row
public class twoDimensionalArray {

	public static void main(String[] args) {
	
		Integer[][] array =  {{1,2,4,4}, {3,4,6,6}, {7,8,9,8}};
		System.out.println(array.length);
		for(int i=0; i < 3; i++) {
			System.out.println("Row : "+i+" Max :" +getMax(array[i]));
		}
	}

	private static int getMax(Integer[] integers) {
		int max = integers[0];
		for(int i=0; i < integers.length; i++) {
			max = (max < integers[i]) ? integers[i] : max;
		}
		return max;
	}

}
