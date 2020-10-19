package class5;

import java.util.Scanner;

public class simple_array_sum {


		public static void main(String[] args) {
			//making array
			Scanner sc = new Scanner(System.in);
		        
		        int n = sc.nextInt();

	        int[] myarray = new int[n];
	        //putting value to the array
	        for(int i = 0; i <= n -1; i++) {
	                 
	        	myarray[i] = sc.nextInt();
	           }
	        
	         int sum = 0;
	         for(int i = 0; i <= myarray.length - 1; i++) {
	        	//System.out.print(myarray[i] + " ");
	        	//System.out.println();
	        	sum = sum +( myarray[i]);
	        }
	        	System.out.print(sum);
            
		
		}

}