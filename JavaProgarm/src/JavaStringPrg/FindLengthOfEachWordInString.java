package JavaStringPrg;

public class FindLengthOfEachWordInString {
	public static void main(String[] args) {
		String str = "Java is programming Language";
		String[] str1 = str.split(" ");
		for (int i = 0; i <= str1.length - 1; i++) {
			System.out.print(str1[i].length() + " ");
		}
	}
}
