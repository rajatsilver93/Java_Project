package Abstract;

public class Bussinessman implements Richman {
	
	@Override
	public void earnmoney() {
		System.out.println("earn");
	}

	public void donation() {
		System.out.println("donate");
	}

	@Override
	public void party() {
		System.out.println("party");

	}

}
