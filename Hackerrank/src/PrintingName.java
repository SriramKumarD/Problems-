
public class PrintingName {
	
	private static void printName(int n, String name) {
	
		if(n != 0) {
			System.out.println(name);
			printName(n-1, name);
		}
	}

	public static void main(String[] args) {
		
		int n=4;
		String name = "Sriram";
		
		printName(n, name);

	}


}
