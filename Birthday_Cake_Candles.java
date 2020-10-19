
package class5;

import java.util.Scanner;

public class Birthday_Cake_Candles {

	
	static int birthdayCakeCandles(int n, int[] ar) {
        int max = 1;
        int counter = 0;
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
                counter = 1;
            } else if (max == ar[i]) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

	
