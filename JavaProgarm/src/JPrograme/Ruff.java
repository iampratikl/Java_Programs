package JPrograme;

public class Ruff {
	public static void main(String[] args) {
		int ar[] = { 12, 23, 11, 24, 102, 55, 48, 75, 26, 89, 98, 102, 24,12 };

		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = i + 1; j <= ar.length - 1; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Duplicate value is " + ar[i]);
				}
			}

		}
	}
}