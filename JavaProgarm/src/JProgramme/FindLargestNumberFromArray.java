package JProgramme;

import java.util.Arrays;

public class FindLargestNumberFromArray {
	public static void main(String[] args) {
		int ar[] = { 10, 25, 12, 9, 100, 200, 55, 98, 198, 77, 201, 199, 11, 26, 49 };
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");

		}
		System.out.println();
		Arrays.sort(ar);
		for (int j = 0; j <= ar.length - 1; j++) {
			System.out.print(ar[j] + " ");
		}
		System.out.println();
		System.out.println("Largest Number in Array: " + ar[ar.length - 1]);
		System.out.println("Smallest Number in Array: " + ar[0]);
	}

}
