package class9;

public class swipe_to_sort_array {

	public static void main(String[] args) {
                
		 int[] arr = {5,2,4,3};
		 for(int  i= 0; i < arr.length -1; i++) {
			 int min  = arr[i];
			 int minindex = i;
			 for(int j = i+1; j < arr.length; j++) {
				 if(arr[j] < min) {
					 min  = arr[j];
				     minindex  = j;	 
				 }
			 }
			 System.out.println(arr[i]);

		 }
		 

	}

}
