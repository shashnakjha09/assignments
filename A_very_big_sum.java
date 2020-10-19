package class5;

public class A_very_big_sum {

	public static void main(String[] args) {
		  long[] myNumbers =  {5000000, 699005995, 858995958, 859575805 , 840987697 , 874874848}; 
          
          
		     long sum = 0;
		     for (int i = 0; i < myNumbers.length; i++) {
	             
		    	 sum = sum + myNumbers[i];
		    	     
		     }
		    System.out.println(sum);
		
		
		
		
	}

}
