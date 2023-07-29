package oop;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a=new Automobile();
		a.setColor("white");
		a.setMake("2021");
		a.setSpeed(50);
		a.Break(20);
		a.Acceleration(20);
		System.out.println("initial speed-->"+a.getSpeed());

		int s=a.getSpeed(); //(1st gear)
		int t=s+30;        //(2nd gear)
		int u=t+30;        //(3rd gear)
		int v=u+30;        //(4th gear)

		if (gear()==1) {
			System.out.println("speed in 1st gear is-->"+s+"km/h");
			
		}
		else if (gear()==2) {
			System.out.println("speed in 2nd gear is-->"+t+"km/h");
			
		}
		else if (gear()==3) {
			System.out.println("speed in 3rd gear is-->"+u+"km/h");
			
		}
		else if (gear()==4) {
			System.out.println("speed in 4th gear is-->"+v+"km/h");
			
		}
		else {
			System.out.println("speed is 0km/h");
		}
		}

		private static int gear() {
			return 2;
		}
}
