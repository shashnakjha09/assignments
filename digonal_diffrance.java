package class5;

import java.util.Scanner;

public class digonal_diffrance {
	
	
	public static void main(String[] args) {
                        

		   int[][] arr = {{3,2,1} , {4,2,3} , {7,9,8}};
		   
		   int digonal1 = 0;
		   int digonal2 = 0;
		   int n = arr.length;
		   for(int  i = 0; i < arr.length; i++) {
			   for(int j = 0; j < arr[0].length; j++) {
				   if(i == j) {
					   digonal1 = digonal1 + arr[i][j];		   
				   }
				   if((i+j) == n-1) {
					   digonal2 = digonal2 + arr[i][j];
				   }
			   }
		   }
		   int result  = digonal1-digonal2;
		   System.out.println(result);
	
	     }
		        
	  }


