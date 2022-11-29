package JPrograme;

public class PrimeNoFromArray {
	public static void main(String[] args) {
		int ar[] = { 51, 15, 28, 35, 95, 78, 63, 22, 11, 54, 72, 5 };
		int k = 0;
		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = 2; j <= ar.length-1; j++) {
				if (ar[i] % ar[j] == 0) {
					k++;
				}
				if (k ==0) {
					System.out.println(ar[i] + " Not prime");
				} else {
					System.out.println(ar[i] + " Is Prime");
				}
			}
		}
	}
}
