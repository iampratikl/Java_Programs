package JPrograme;

import java.util.Arrays;

public class FindLargestNumberFromTwoNo {

	public static void main(String[] args) {
		int ar[] = { 12, 11 };
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		Arrays.sort(ar);
		for (int j = 0; j <= ar.length - 1; j++) {
			System.out.print(ar[j] + " ");
		}
		System.out.println();
		System.out.println("Largest Number is " + ar[ar.length - 1]);
		System.out.println("Smallest Number is " + ar[0]);
	}

}
