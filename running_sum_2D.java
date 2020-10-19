package class7;

import java.util.Scanner;

public class running_sum_2D {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

   int[] myarray = new int[n];
   //putting value to the array
   
   for(int i = 0; i <= n -1; i++) {
            
   	myarray[i] = sc.nextInt();
   	 
     }
       
   int sum = myarray[0];
   System.out.print(sum);
   for(int i = 1; i <= myarray.length - 1; i++) {
	   
	   sum = sum + myarray[i];
	   
	  // System.out.print(array[0]);
	   
       System.out.print("," +sum);
   }
   
   
   
   
   
	}

}
