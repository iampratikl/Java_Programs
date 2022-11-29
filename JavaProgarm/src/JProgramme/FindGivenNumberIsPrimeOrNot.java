package JProgramme;

public class FindGivenNumberIsPrimeOrNot {
	public static void main(String[] args) {
		int a = 54;
		int k = 0;

		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0)
				k++;
		}
		if (k > 0) {
			System.out.println(a + " Is Not Prime Number");
		} else {
			System.out.println(a + " Is Prime Number");
		}

	}

}
