package 입출력스트림;

import java.io.FileWriter;

public class Sample06 {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			fw= new FileWriter("text2.txt");

			fw.write('A');
			char[] buf = { 'B', 'C', 'D' };
			fw.write(buf);
			fw.write(buf, 1, 2); // buf 1번방 부터 2개를 넣겠다

			String str = "가나다라";
			fw.write(str);
			fw.write(str, 2, 2); // str 2번방 부터 2개를 넣어라

		} catch (Exception e) {
		} finally {
			try {
				fw.flush();
				fw.close();
			} catch (Exception e2) {

			}
		}
	}

}
