package Thread;

public class TestThreadDaemon {
	public static void main(String[] args) {
		ThreadDaemon d1 = new ThreadDaemon("Rajat");
		ThreadDaemon d2 = new ThreadDaemon("Arun");
		ThreadDaemon d3 = new ThreadDaemon("Monil");
		
		d1.setPriority(10);
		d2.setPriority(5);
		d3.setPriority(1);
		
		d1.setDaemon(true);
		d2.setDaemon(true);
		d3.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();


		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(200);

			} catch (Exception e) {

			}

			System.out.println(i+"="+"main");

		}

	}
}
