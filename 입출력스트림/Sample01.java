package 입출력스트림;

import java.io.IOException;
import java.io.InputStream;

public class Sample01 {

	public static void main(String[] args) {

		try {
			InputStream in = System.in;
			int data = 0;

			while ((data = in.read()) != -1) {				//read 자체가 1byte씩 읽어 오지만 정수형태로 읽어오게 되고
				System.out.print((char) data);				// 그냥 출력해버리면 읽어오면 숫자로 나옴
			}
		} catch (IOException e) {
		
		}
	}
}
