package class7;

import java.util.Scanner;

public class even_number_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

    int[] myarray = new int[n];
    //putting value to the array
    for(int i = 0; i <= n -1; i++) {
             
    	myarray[i] = sc.nextInt();
    	 
      }
    int total=0;
    for(int i = 0; i <= myarray.length-1; i++) {
            
    	int count = 0; 
       
    	while(myarray[i] != 0)
        {
        	myarray[i] = myarray[i]/10;
            count++;
        }
    	 //System.out.print(count);   
    	 
    	 if(count % 2 ==0  ) {
             System.out.println(count);
             ++total;
         }
    }
    System.out.println("total " +total);
	    
       
    
	}
}
