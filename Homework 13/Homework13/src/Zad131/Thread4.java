package Zad131;

import java.util.Random;

public class Thread4 extends Thread{
	
	public void run() {
		
		try {
			System.out.println("The thread is started!");
			
			setName("Thread4");
			getName();
			
			Random rand = new Random();
			int randomInt = rand.nextInt(10000);
			Thread.sleep(randomInt);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("The thread4 is complete!");
	}
	
	
}
