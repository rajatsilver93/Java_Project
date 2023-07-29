
public class TwodArray1 {
public static void main(String[] args) {
	int[][]a= {{1,2,3},{-4,5}};
	System.out.println(a[0].length);
	System.out.println(a[1].length);

	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]);
			
		}
		
	}
}
}
