package 속도비교;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample01 {

	public static void main(String[] args) throws Exception { // 예외처리 떠넘기기

		/** 인풋, 아웃푼 메인스트림 */
		FileInputStream fis = null;
		FileOutputStream fos = null;

		/** 인풋, 아웃푹 보조스트림 */
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int data = 0;
		long start = 0;
		long end = 0;

		fis = new FileInputStream("src/속도비교/apple.png"); // 내보내기
		fos = new FileOutputStream("src/apple.png"); // 들여보내기

		start = System.currentTimeMillis(); // 시작 시간

		while ((data = fis.read()) != -1) { // 읽어오고
			fos.write(data); // 내보내고
		}
		fos.flush(); // 찌꺽스 처리
		end = System.currentTimeMillis();
		fos.close();
		fis.close();

		System.out.println("버퍼 사용 X : " + (end - start));

		fis = new FileInputStream("src/속도비교/apple.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src/apple.png");
		bos = new BufferedOutputStream(fos);

		start = System.currentTimeMillis(); // 시작 시간

		while ((data = bis.read()) != -1) { // 읽어오고
			bos.write(data); // 내보내고
		}
		bos.flush(); // 찌꺽스 처리
		end = System.currentTimeMillis();
		bis.close();
		bos.close();
		fos.close();
		fis.close();

		System.out.println("버퍼 사용 O : " + (end - start));

	}

}