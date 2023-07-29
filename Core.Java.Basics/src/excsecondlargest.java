
public class excsecondlargest {
	public static void main(String[] args) {
		int[] s= {45,41,40,63,55,69,50,99,98};
		int a=0;
		int b=s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i]>b) {
				a=b;
				b=s[i];
			}
			if (a<s[i]&& s[i]<b) {
				a=s[i];
				
			}
			
		}	System.out.println(a);	
	}

}
