package class7;

import java.util.Scanner;

public class suffle_array {

	public static void main(String[] args) {
                
	    Scanner sc = new Scanner(System.in);

	    //int n = sc.nextInt();
	   // int[] nums = new int[n];
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
	    int[] res = new int[ 2 * n];
	    
        int i = 0;
        int j = n;
        
        int curr = 0;
        
        while (i < n) {
            res[curr] = nums[i];
            curr++;
            i++;
            res[curr] = nums[j];
            curr++;
            j++;
        }
       for(int  k = 0; k < curr; k++) {
    	   System.out.print(res[k] + " ");
       }
	}

}
