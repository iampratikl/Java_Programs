package JProgramme;

public class FindPrimeNumberFromArray {
	public static void main(String[] args) {
		int ar[] = { 10, 55, 50, 49, 48, 47, 89, 79, 60, 70 };
		int k = 0;

		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = 2; i <= ar[i] / 2; j++) {
				if (ar[i] % ar[j] == 0) {
					k++;
				}
				if (k > 0) {
					System.out.println(ar[i] + " is Not prime number");
				} else {
					System.out.println(ar[i] + "is prime number");
				}
				System.out.println();
			}
		}
	}
}
