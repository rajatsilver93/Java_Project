
public class Exc14averageoddeven {
	public static void main(String[] args) {
		int n = 30;
		int e = 0; //(even)
		System.out.println(e);
		int o = 0; //(odd)
		System.out.println(o);
		int es=0;  //(evensum)
		int os=0;  //(oddsum)
		int ea;    //(even average)
		int oa;    //(odd average)
		while (n>0) {
			if (n%2==0) {
				e++;
				es=es+n;
			}
			else {
				o++;
				os=os+n;
			}
			n--;
			}
		ea=es/e;
		oa=os/e;
		
		System.out.println("AE = "+ea);
		System.out.println("AO = "+oa);
	}

}
