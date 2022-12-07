package 객체입출력;

import java.io.File;

public class Sample02 {

	public static void main(String[] args) {

		File f= new File("text.txt");
		
		
		
		
		System.out.println(f.length()+"byte");	// 파일 용량 알려줌
		
		System.out.println(f.canWrite()); 	// 쓰기권한
		
		System.out.println(f.canRead());	// 읽기 권한에 관해 알려줌 
		
		System.out.println(f.getPath());
		
		System.out.println(f.getAbsolutePath());  		// 경로 알려줌
		
		System.out.println(f.getName()); // 파일명 나오게끔 			
		
		System.out.println(f.isDirectory()); 		
		
		System.out.println(f.isFile());		//파일인지 아닌지 true or false로 리턴됨

	}

}
