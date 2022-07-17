
public class SpiralPrint {

	public static void main(String[] args) {
		
		 int R = 4;
	        int C = 4;
	        int a[][] =  {{1, 2, 3, 4},
	                   {5, 6, 7, 8},
	                   {9, 10, 11, 12},
	                   {13, 14, 15, 16}};
	 
	        
	        spiralPrint(R, C, a);
	}

	private static void spiralPrint(int m, int n, int[][] a) {


		int i, l = 0, k = 0;
		
		//m- row end index
		//n- column end index
		//k- row start index
		//l- column start index
		
		while (k < m && l < n) {
			
			//print fist row
			for(i = l; i < n; i++) {
				System.out.print(a[k][i]);
			}
			k++;
			
			//print last column
			for(i=k; i<m; i++) {
				System.out.print(a[i][n-1]);
			}
			n--;
			
			//print last row
			if(k < m) {
				for(i=n-1;i>=l;i--) {
					System.out.print(a[m-1][i]);
				}
			}
			m--;
			//print first column
			if (l < n) {
				
				for (i=m-1;i>=k;i--) {
					System.out.print(a[i][l-1]);
				}
			}
			l++;
			
		}
		
	}

}
