import java.util.Arrays;

//Given an integer array nums of size n, return the number with the value closest to 0 in nums. 
//If there are multiple answers, return the number with the largest value.
public class ClosestToNumber0 {

	public static void main(String[] args) {
	
		        int[] data = {2,3,-2,-1};
		        int curr = 0;
		        int near = data[0]; 
		        Arrays.sort(data);      //  add this
		        System.out.println(Arrays.toString(data));        
		        // find the element nearest to zero
		        for ( int i=0; i < data.length; i++ ){
		            System.out.println("dist from " + data[i] + " = " + Math.abs(0 -data[i]));
		            curr = data[i] * data[i]; 
		            if ( curr <= (near * near) )  { 
		                near = data[i];
		            } 
		        }
		        System.out.println( near );
		    }
	}

