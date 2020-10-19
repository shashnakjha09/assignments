package class8;

import java.util.Scanner;

public class missing_number {

	     public static int missing_num (int[] nums) {
	    	 
	    	    
             int missing = nums.length;
             for (int i = 0; i < nums.length; i++) {
              missing ^= i ^ nums[i];
        }
        return missing;
          
	     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

    int[] nums = new int[n];
    //putting value to the array
    for(int i = 0; i <= n -1; i++) {
    	nums[i] = sc.nextInt(); 
      }

    int result  = missing_num(nums);
    
    System.out.println(result);
    
	}
}
