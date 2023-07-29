
public class Atm {
	public static void main(String[] args) {
		
		int amount =2525;
		int count = 0;
		int[] note = {2000 , 500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1};
	
		for (int i = 0; i < note.length; i++) {
			count = amount/note[i];
			amount -= count*note[i];
			System.out.println(note[i] + "-" + count);
			
		}
	}
}
