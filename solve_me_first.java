package class5;

import java.util.Scanner;

public class solve_me_first {
    
	 public static int solveMeFirst(int a, int b) {
		   
		    return a + b;
		  
	 }
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();


		int result = solveMeFirst(a,b);
		 System.out.println(result);
		 
	}

}
