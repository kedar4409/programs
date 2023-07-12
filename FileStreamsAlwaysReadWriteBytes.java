package practice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamsAlwaysReadWriteBytes {
	public static void main(String args[]) throws Exception {
		// Create file temp.txt on given location
		try (OutputStream os = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\temp2.txt"); 
				InputStream is = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\temp.txt");) {
			int i999 = 0b00000000_00000000_00000011_11100111;
			int i20 =  0b00000000_00000000_00000000_00010100;
			os.write(i999);
			os.write(i20);
			System.out.println(i999 + ":" + is.read());
			System.out.println(i20 + ":" + is.read());
		}
	}
}
