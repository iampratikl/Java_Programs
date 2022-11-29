package JPrograme;

import java.util.Arrays;

public class LargestNumberFromArray {
	public static void main(String[] args) {
		int ar[] = { 51, 15, 28, 35, 95, 78, 63, 22, 11, 54, 72, 5, 3 };
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		Arrays.sort(ar);
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.print("Largest Number is " + ar[ar.length - 1]);
		System.out.println();
		System.out.println("Smallest Number is " + ar[0]);
	}

}
