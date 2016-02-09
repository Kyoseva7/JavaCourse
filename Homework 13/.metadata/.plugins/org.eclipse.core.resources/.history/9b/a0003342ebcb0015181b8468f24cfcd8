package Zad133;

public class Thread1 extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 50000; i++) {
			System.out.println(i);
			if(i == 25000) {
				try {
					wait();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
