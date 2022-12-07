package 입출력스트림;

import java.io.FileOutputStream;
import java.io.PrintStream;

//아웃풋

public class Sample05 {

   public static void main(String[] args) {
      
      FileOutputStream fos = null;
      PrintStream ps = null;
      
      try {
         fos = new FileOutputStream("test.txt", true);
         ps = new PrintStream(fos); //보조 스트림, 보조할 대상을 소괄호안에 넣는다.
         
         ps.println("가나다");
         ps.print(123);
         ps.println(true);
         ps.print(3.14);

               
      } catch (Exception e) {
         
      } finally {
         try {
            fos.flush(); //스트림에 남아있는 내용(찌꺼기)을 다 내보낸 후
            fos.close(); //스트림을 닫아준다.
         } catch(Exception e) {
            
         }
      }

   }

}