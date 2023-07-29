
public class exc13harmonic {
	public static void main(String[] args) {
		int a = 7;
		double b = 0.0;
		System.out.print("harmonic series-");
		while (a > 0) {
			b = b + (double) 1 / a;
			a--;
			System.out.print(b + ",");
		}
	}

}
