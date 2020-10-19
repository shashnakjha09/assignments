package class8;

import java.util.Scanner;

public class buy_and_sell_stock {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

   int[] myarray = new int[n];
   //putting value to the array
   
   for(int i = 0; i <= n -1; i++) {
	    	
   	myarray[i] = sc.nextInt();
   	 
     }
        int max = 0;
        int min  = 0;
        int profit = 0;
        for(int i = 0; i < myarray.length; i++) {
        	min  = myarray[i];
            for(int j = i+1; j < myarray.length; j++) {
                 if(myarray[j] > min) {
                	 max = myarray[j];
                	 
                	 if(max-min > profit) {
                		 profit  = max - min;
                	 }
                 }
            }
      
	}
     
        System.out.println(profit);

}
}