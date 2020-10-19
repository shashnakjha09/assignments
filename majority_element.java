package class7;

import java.util.Arrays;
import java.util.Scanner;

public class majority_element {
	
	public static void majorityelement(int[] arr ,int  n) {
		int maxcount  = 0;
		int index  = -1;
		for(int i = 0; i < n; i++) {
			int count  = 0;
			for(int  j = 0; j < n ; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			  if(count > maxcount) {
				  maxcount  = count;
				  index  = i;
			  }
			}
		
		}
		if(maxcount > n/2) {
			System.out.println(maxcount);
		}
		else {
			System.out.println("not found");
		}

	}

	public static void main(String[] args) {
                 
    int[] arr = {1,1,2,1,3,5,1};
     
    int n = arr.length;
    
    majorityelement(arr , n);
   
	}
}
