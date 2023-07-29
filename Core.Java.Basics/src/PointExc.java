
public class PointExc {
	public static void main(String[] args) {
     String[] v = {"1.2", "10.20","13.34","14.34"};	
		for (int i = 0; i < v.length; i++) {
			String[] a= v[i].split("[.]");
			System.out.println(a);
		}

	//	v[].split("[.]");
		System.out.println(v[0]);
		//System.out.println(value[1]);
		double d = 1000.56;
		double e = 999.45;
		String s = String.valueOf(d);
		String []arr=s.split("[.]", 0);
		int i =0;
		
		String p = String.valueOf(e);
		String []ar =p.split("[.]", 0);
		int j =0;
		//System.out.println(ar[0]);
		//System.out.println(ar[1]);
		
				//System.out.println(arr[0]);
				//System.out.println(arr[1]);
				int k = Integer.parseInt(arr[0]);
				int l = Integer.parseInt(ar[0]);
				
				int m = Integer.parseInt(arr[1]);
				int n = Integer.parseInt(ar[1]);
				int o = m+n;
				System.out.println(o);
				
				
				int f = k + l ;
				System.out.println(f);
				
				System.out.println(o+f);
		
	}

}
