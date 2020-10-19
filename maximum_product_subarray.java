package class8;

import java.util.Scanner;

public class maximum_product_subarray {

	 public static int maxProduct(int[] nums) {
		    
		    int max = 0;
		    for(int  i = 0; i <= nums.length-1; i++) {
		    	for(int j = i + 1; j < nums.length; j++) {
		    		int result = nums[i] * nums[j];
		    		if (result > max) {
		    			max  = result;
		    		}
		    	}
		    }
		    return max;
	 }
	 
	public static void main(String[] args) {
                        
		 Scanner sc = new Scanner(System.in);
	        
         int n = sc.nextInt();

         int[] nums = new int[n];
         //putting value to the array
    
         for(int i = 0; i <= n -1; i++) {
             
    	 nums[i] = sc.nextInt();
    	 
      }
         
         int result = maxProduct(nums);
         System.out.println(result);
	}

}
