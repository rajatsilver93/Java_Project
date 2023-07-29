package Thread;

public class ThreadDaemon extends Thread {
	String name = null;
	public ThreadDaemon(String name) {
		this.name=name;
		}
	@Override
		public void run() {
		while (true) {
			
			for (int i = 1; i <=10; i++) {
				try {
					Thread.sleep(500);
					System.out.println(i+"="+name);
					
					
				} catch (Exception e) {
					
				}
			}
		}
}
}
