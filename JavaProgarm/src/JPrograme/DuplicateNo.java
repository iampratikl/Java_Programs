package JPrograme;

public class DuplicateNo {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 6, 3, 6, 1 };

		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = i + 1; j <= ar.length - 1; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Duplicate Number is " + ar[i]);
				}
			}
		}

	}
}
