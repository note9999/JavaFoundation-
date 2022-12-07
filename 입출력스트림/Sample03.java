package 입출력스트림;

import java.io.FileReader;

public class Sample03 {

	public static void main(String[] args) {

	FileReader fr= null;
	
	try {
		fr = new FileReader("src/입출력스트림/Sample01.java");
		int data = 0;
		while( (data=fr.read())!= -1) {
			System.out.print((char)data);
		}
	} catch (Exception e) {
	
	}finally {
		try {
			fr.close();
		} catch (Exception e2) {
		}
	}
	}

}
