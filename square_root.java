package class8;

public class square_root {
      public static int root( int x) {
    	int root1 = (int) Math.sqrt(x);
		return root1;
      }
	 
	public static void main(String[] args) {
               
		int x = 10;
		
		int result = root(x);
		System.out.println(result);
	}

}
