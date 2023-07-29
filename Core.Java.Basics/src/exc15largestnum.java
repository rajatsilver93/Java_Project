
public class exc15largestnum {
	public static void main(String[] args) {
		int[]a=new int[] {11,22,5,4,82,56};
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>b) {
		     b=a[i];
			}
		
		}
		System.out.println(b);
	}

}
