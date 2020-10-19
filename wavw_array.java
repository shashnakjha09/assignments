package class9;

public class wavw_array {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4};
		int l = arr.length;
		int n = 2;

	    int[] res = new int[2 * n];
	    
	    int i = 0; 
	    
		int j = n;
		
		while(i < n) {
			      
			   int temp = arr[i];
			   arr[i] = arr[i + 1];
			   arr[i + 1 ] = temp;
			   i++;
			   

		}
	for( i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
