package JPrograme;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 5;
		int k = 0;
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0)
				k = k + 1;
		}
		if (k > 0) {
			System.out.println(a + " is not prime number");
		} else {
			System.out.println(a + " is prime number");
		}
	}
}
