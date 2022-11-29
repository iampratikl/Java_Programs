package JPrograme;

public class Fibonaces {
	public static void main(String[] args) {
		int p = 1;
		int q = 1;
		int length = 5;

		for (int i = 1; i <= length; i++) {
			int sum = p + q;
			p = q;
			q = sum;
			System.out.println(sum);
		}

	}

}
