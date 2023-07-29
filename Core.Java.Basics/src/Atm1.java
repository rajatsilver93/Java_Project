
public class Atm1 {
	public static void main(String[] args) {
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 50, 5, 2, 1 };
		int amount = 2626;
		int count = 0;
		int remainder = 0;

		for (int i = 0; i < notes.length; i++) {
			count = amount / notes[i];
			if (count > 0) {
				System.out.println(notes[i] + " - " + count);
			}
			remainder = amount % notes[i];
			amount = remainder;
		}
	}
}
