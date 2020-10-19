package class8;

import java.util.Scanner;

public class Sorted_Insert_Position {
	
	
	public static int position(int arr[] , int x) {
	   
		 int n = arr.length; 
		    for(int i = 0; i < n; i++) 
		    { 
		        if(arr[i] == x) { 
		            return i; 
		        }
		    
		        else if(arr[i] > x)
		        	return i;
		             	
		    }
		    
		    
		    return n;
		} 
		  
		public static void main(String args[]) 
		{ 
		    int arr[] = { 2, 3, 4,30,40 };  
		    int x = 10; 
		      
		    int result = position(arr, x); 
		    if(result == -1) 
		        System.out.print("Element is not present in array"); 
		    else
		        System.out.print("Element is present at index " + result); 
	}

}
