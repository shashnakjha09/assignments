package class8;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class mejority_element {

		public static void main(String[] args) {
            
	    int[] myarray  = {2,2,1,1,1,2,2};
	    
	    int temp = 0;
	    int n = myarray.length;
	    Arrays.sort(myarray);
	    
	    int result = 0;
	     int count = 0;
	    for(int i = 0; i < n; i ++) {
	    	 if(count == 0){
	             result = myarray[ i ];
	             count = 1;
	         }else if(result == myarray[i]){
	            count++;
	         }else{
	            count--;
	         }
	    }

	    System.out.println(result);


	}

}
