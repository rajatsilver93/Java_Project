package Exercise;

import java.time.LocalDate;
import java.time.Period;

public class Ex7_1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate DOB = LocalDate.of(1993, 01, 30);
		int years = Period.between(DOB, today).getYears();
		
		System.out.println("Current date-->"+today);
		System.out.println("DOB-->"+DOB);
		System.out.println("Age-->"+years);
		

}
}