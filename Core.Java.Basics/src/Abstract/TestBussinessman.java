package Abstract;

public class TestBussinessman {
	public static void main(String[] args) {
		Richman rm = new Bussinessman();

		rm.earnmoney();
		rm.donation();
		rm.party();

		Bussinessman1 rm1 = new Bussinessman1();

		rm1.earnmoney();
		rm1.donation();
		rm1.party();
		rm1.helpToOthers();
		
		Bussinessman2 rm2= new Bussinessman2();
		
		rm2.donation();
	}
}
