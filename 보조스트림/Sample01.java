package 보조스트림;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample01 {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("test3.txt");
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeUTF("°¡³ª´Ù");
		dos.writeDouble(3.14);
		dos.writeInt(20);
		dos.writeBoolean(true);

		dos.flush();
		dos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("test3.txt");
		DataInputStream dis = new DataInputStream(fis);

		System.out.println(dis.readUTF());
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());

	}

}
