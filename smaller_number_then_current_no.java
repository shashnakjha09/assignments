package class7;

import java.util.Scanner;

public class smaller_number_then_current_no {

	public static void main(String[] args) {
                   
		int[] nums = {8,1,2,2,3};
		
		int n = nums.length;
		int[] newarray  = new int[n];
		   
		

	       for(int i  = 0; i < n; i++) {
			   int count  = 0;

		   for(int j = n-1; j >= 0; j--) {
			   if(nums[i] > nums[j]) {
				   count++;
			   }
		   }
		   
	     	  System.out.print(count + " ");
    
}
	  				
	}
}
