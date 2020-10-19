package class5;

import java.util.Scanner;

public class compare_the_triplet {

	public static void main(String[] args) {
            
		    int[] alice = new int[3];
		    int[] bob = new int[3];
		    int[] result = new int[2];
		    int alice1 = 0;
		    int bob1 = 0;
		    Scanner sc = new Scanner(System.in);
		    
		    for(int i = 0; i <=alice.length-1 ; i++) {
		    	
		    	alice[i] = sc.nextInt();
		    	
		    }
		    for(int i = 0; i <= bob.length-1; i++) {
		    	
		    	bob[i] = sc.nextInt();
		    	
                if(alice[i] > bob[i]) {
                    
                	 alice1 = alice1 + 1;

                }
                else if(alice[i] < bob[i]) {
                	bob1 = bob1 + 1;
                }
                else if(alice[i] == bob[i]) {
                	  	
                }
		    }
		    System.out.print(alice1+ " ");
		    System.out.print(bob1);
	}

	
}
