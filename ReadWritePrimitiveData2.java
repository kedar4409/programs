package practice.io;

import java.io.*;

public class ReadWritePrimitiveData2 {
	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Kedar10\\Desktop\\myData.data"));
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\myData.data");
				DataInputStream dis = new DataInputStream(fis);) {
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeInt(99);
			System.out.println(dis.readInt());
		}
	}
}
