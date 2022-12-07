package 입출력스트림;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class Sample04 {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("src/입출력스트림/Sample01.java");
			br = new BufferedReader(fr); // 버퍼가 어떤 것을 보조할지(fr을 보조하려고 fr을 넣음)

			String txt = null;

			while ((txt = br.readLine()) != null) {
				System.out.println(txt);
			}

		} catch (Exception e) {
		
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			
			}
		}
	}

}
