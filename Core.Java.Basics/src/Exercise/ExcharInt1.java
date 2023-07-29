package Exercise;

public class ExcharInt1 {
	public static void main(String[] args) {
		String[] s1 = { "abc11", "ah2jj", "hj658poy" };
		int sum = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1[i].length(); j++) {
				char c = s1[i].charAt(j);
				
				if (c >= '0' && c <= '9') {
					int num = Integer.parseInt(String.valueOf(c));
					System.out.println(num);
					sum = sum + num;
					num = 0;
				}
			}
		}
		System.out.println("Sum = " + sum);
	
	}
}
