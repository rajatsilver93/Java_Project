package Abstract;

public class Bussinessman1 implements  SocialWorker,Richman {


	@Override
	public void helpToOthers() {
		System.out.println("help others");
	}

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
