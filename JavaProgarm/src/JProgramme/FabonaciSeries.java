package JProgramme;

public class FabonaciSeries {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int length = 5;

		for (int i = 0; i <= length - 1; i++) {
			int sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}
	}

}
