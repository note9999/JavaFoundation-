package Thread;

public class Thread1 extends Thread{

	public void run() {					//run 메서드 고정
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread1: "+i);
			
		}
	}
}