package JavaStringPrg;

public class ConvertFirstCharacterOfStringToCapital {
	public static void main(String[] args) {
		String str = "we are going to mumbai";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			char c = str1[i].charAt(0);
			String c1 = String.valueOf(c).toUpperCase();

			String sub = str1[i].substring(1);

			System.out.print(c1 + sub + " ");
		}
	}

}
