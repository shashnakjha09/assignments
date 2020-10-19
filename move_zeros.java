package class8;

public class move_zeros {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
         
		int[] arr = {0,1,0,3,12};
		
		int j = 0;
		int i = 0;
		
		while(j < arr.length) {
			if(arr[j] != 0) {
				arr[i++] = arr[j];
			}
			j++;
			
		}
     	while(i < arr.length) {
			arr[i++] = 0;
		}
        for(i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + ",");
        }
		
	}

}
