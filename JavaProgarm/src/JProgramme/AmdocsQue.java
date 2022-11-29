package JProgramme;

public class AmdocsQue {
	public static void main(String[] args) {
		int num = 4;
		int k = 1;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

}
