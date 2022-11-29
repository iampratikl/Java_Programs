package JProgramme;

public class FindDuplicateNumberFromArray {
	public static void main(String[] args) {

		int ar[] = { 10, 22, 25, 26, 27, 28, 25, 24, 10, 50, 45, 26, 22 };
		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = i + 1; j <= ar.length - 1; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Duplicate Numer is " + ar[i]);
				}
			}
		}
	}

}
