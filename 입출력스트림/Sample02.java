package 입출력스트림;

import java.io.FileInputStream;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Sample02 {

   public static void main(String[] args) {
	   FileInputStream fis =null;
      
	   
	   try { //괄호안에 경로를 설정하면 경로에 있는 데이터를 가져와서 fis 변수에 저장됨
         fis = new FileInputStream("src/입출력스트림/Sample01.java");
               
            int data = 0; //종료시키게 하기 위한 변수 하나 선언
            
            byte[] buf = new byte[fis.available()]; 
            
            while((data=fis.read(buf,0,buf.length)) != -1) {
               System.out.print(new String(buf,0,data));
            }
      } catch(Exception e) {
         
      } finally {
		try {
			fis.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

   }

}