

//Form two dimensional zipzag format based on given input
public class twoDimensionalArrayCreation {
	
	public static void main(String args[]) {
		
		int input = 2;
		
		createSprialArray(input);
		
	}

	private static void createSprialArray(int input) {
	
		Integer[][] array = new Integer[input][input];
		int value = 1;
			for(int i =0; i<input; i++) {
				
				for(int j =0; j<input; j++) {
					array[i][j] = value;
					value ++;
				}
			}
			
		System.out.println("NewArray: "+array);
		
		for(int i =0; i<array.length; i++) {
			
			for(int j =0; j<array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
