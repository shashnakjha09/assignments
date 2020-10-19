package class5;

import java.util.Arrays;
import java.util.Scanner;

public class mini_max_sum {

	public static void main(String[] args) {
		//making array
		Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();

        int[] myarray = new int[n];
        //putting value to the array
        for(int i = 0; i <= n -1; i++) {
                 
        	myarray[i] = sc.nextInt();
        } 
        
        int[] result  = miniMaxSum(myarray);
        for(int i  = 0; i <= myarray.length -1; i++) {
        	
        
        System.out.println(result[i]);
        }
          }
       //sorting array
      
        static int[] miniMaxSum(int[] myarray) {
        Arrays.sort(myarray);
        // mini values
        int min_sum = 0;
        for(int i = 0; i < myarray.length - 1; i++) {
     	    min_sum = min_sum + myarray[i];
     	    
        }
      //maximum sum
        int max_sum = 0;
        for(int i = 1; i < myarray.length; i++) {
     	        max_sum = max_sum + myarray[i]; 
     	      
        }
		
       int[] result  = {max_sum , min_sum};
        //System.out.println(min_sum + " " +max_sum);
		return result;

	
	}
}