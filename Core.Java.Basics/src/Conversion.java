
public class Conversion {
	public static void main(String[] args) {
//char to int--->
		String s = "Rajat93";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				count = count + Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(count);
		
//string to	asccii-->
		int a;
		// System.out.println((char)a);
		for (char i = 'a'; i <= 'z'; i++) {

			System.err.print(i + "-->" + (int) i);
			System.err.print("  ");
		}
		String r = "rajat";
		char z;

		for (int k1 = 0; k1 < r.length(); k1++) {
			z = r.charAt(k1);
			for (int i = 0; i < r.length(); i++) {

				if (z == r.charAt(k1)) {
					count++;
					System.out.println();
					System.out.print(s.charAt(k1) + "--" + (int) r.charAt(k1));
					break;
				}

			}

		}

	}
}
