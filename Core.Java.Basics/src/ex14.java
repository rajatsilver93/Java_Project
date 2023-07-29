
public class ex14 {
public static void main(String[] args) {
	int sum1 = 0;
	int sum2 = 0;
	int number = 30;
	//System.out.println("even number");
	for (int i = 2; i <= number; i=i+2) {
		//System.out.println(i);
		sum1 = sum1 +i;
	}
	sum1 = sum1/(number/2);
	System.out.println("average even number = " + sum1);
	//System.out.println();
	//System.out.println("odd number");
	for (int i = 1; i <= number; i=i+2) {
		//System.out.println(i);
        sum2 = sum2+i;
	}
	sum2 = sum2 / (number/2);
	System.out.println("average odd number = " + sum2);
}
}