package class9;

import java.util.Scanner;

public class crush_problem {

	public static void main(String[] args) {

      		
	    Scanner sc  = new Scanner(System.in);
             
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int[] arr = new int[n+1];
	    
	    for( int i = 0; i < m; i ++ ) {
	    	int x = sc.nextInt();
	    	int y = sc.nextInt();
	    	int val = sc.nextInt();
             
	    	arr[x] = arr[x] + val;
	        
	    	if(y+1 <=n) {
	    		arr[y+1] = arr[y+1] - val;
	    	}
	    	
	    }
	    for(int i = 1; i<=n; i++) {
	    	arr[i] = arr[i]+ arr[i-1];
	    	
	    }
	    
	    //find the max
	    int max  = arr[0];
	    for(int i = 1; i <=n; i++) {
	    	max  = Math.max(arr[i] , max);
	    }
	    System.out.println(max);
}
}