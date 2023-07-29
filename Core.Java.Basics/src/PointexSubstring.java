
public class PointexSubstring {
	public static void main(String[] args) {
				String[] name = { "12.20", "12.23", "14.17", "14.20" };
				int sum1 = 0;
				int sum2 = 0;
				for (int i = 0; i < name.length; i++) {
					String b = name[i].substring(0, 2);
					int d = Integer.parseInt(b);
					sum1 = sum1 + d;
				}
				System.out.println("Point before sum = " + sum1);

				for (int j = 0; j < name.length; j++) {
					String a = name[j].substring(3);
					int e = Integer.parseInt(a);
					sum2 = sum2 + e;
				}
				System.out.println("point after sum = " + sum2);
			}
		}


