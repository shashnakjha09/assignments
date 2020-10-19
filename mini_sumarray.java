package class8;

import java.util.Scanner;

public class mini_sumarray {
	
	
	public static int mini_subarray(int[] nums) {
		
		int currentsum = 0;
		boolean onepositive = false; 
		int maxsum = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i< nums.length; i++) {
			
			currentsum = currentsum + nums[i];
			
			if(currentsum < 0 ) {
				currentsum = 0;
			}
			if(currentsum > 0) {
				onepositive = true;
			}
		maxsum = Math.max(maxsum, currentsum);
		max = Math.max(max, nums[i]);
		}
		if(onepositive == false) {
			return max;
		}
		return (maxsum);
 		}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
         int n = sc.nextInt();

         int[] nums = new int[n];
         //putting value to the array
    
         for(int i = 0; i <= n -1; i++) {
             
    	 nums[i] = sc.nextInt();
    	 
      }
         
         int result = mini_subarray(nums);
         System.out.println(result);
	}
      
}
