package Thread;
/**
 * 	클래스 두개를 생성
 * 	Thread1->Thread 클래스를 상속
 *	Thread2-> Runnable 인터페이스를 상속(구현)
 *	각각 1~100까지 출력물 구현
 *	메인문 실행
 */
public class ThreadMain {

	public static void main(String[] args) {

		Thread1 t1= new Thread1();
		
		Thread t2= new Thread(new Thread2());
		
		t1.start(); // 쓰레드 실행시킬 떄는 .start 이용! 
		t2.start();
	}

}
