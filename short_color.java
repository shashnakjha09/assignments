package class8;

import java.util.Scanner;

public class short_color {

	
	//  public static int color_short(int[] nums) {
//		  int temp = 0;
//	        for(int i = 0; i <= nums.length - 1; i++) {
//	            for(int j = i+1; j <= nums.length - 1; j++) {
//
//	     	   if(nums[i] > nums[j]) {
//	     		   temp = nums[i];    
//	     		  nums[i] = nums[j];    
//	     		 nums[j] = temp; 
//	     	   }
//	     		   
//	     		   
//	        }
//	            
// 	       }
//         return temp ;
//	  }
	public static void main(String[] args) {
		

         int[] nums = {4,7,2,1,3,8};
         int temp = 0;
         int count = 0;
	        for(int i = 0; i <= nums.length - 1; i++) {
	            for(int j = i+1; j <= nums.length - 1; j++) {

	     	   if(nums[i] > nums[j]) {
	     		   
	     		   temp = nums[i];
	     		   nums[i] = nums[j];    
	     		   nums[j] = temp; 
	     		  
	     	   }

	     	   }
 	     		   
	            //System.out.println(count);
	            System.out.print(nums[i] + " ");

	        }
		     	   

	       }

         

	}


