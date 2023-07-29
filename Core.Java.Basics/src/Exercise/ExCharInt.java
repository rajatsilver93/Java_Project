package Exercise;

public class ExCharInt {
	public static void main(String[] args) {
		String[] s= {"abc11","ah2jj","hj658poy"};
		int sum=0;
		for (String string : s) {
			for (int i = 0; i < string.length(); i++) {
				//System.out.print(string.charAt(i));
				try {
					sum=sum+Integer.parseInt(string.charAt(i)+"");
					
				} catch (Exception e) {
			
				}
			}
			
		}
		System.out.println("int sum-" +sum);
		
	}

}
