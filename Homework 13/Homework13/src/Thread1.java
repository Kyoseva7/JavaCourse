
public class Thread1 extends Thread {

	public void run() {
		for (int i = 0; i < 1000000; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.print("z");
		}

	}
}
