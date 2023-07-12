package practice.io;

import java.io.*;

public class ReadWriteBytesUsingFiles2 {
	public static void main(String[] args) throws IOException {
		// Create file Sample.txt or Sample.pdf on given location
		try (FileInputStream in = new FileInputStream(new File("C:\\Users\\Kedar10\\Desktop\\Sample.txt"));
				FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\Sample2.txt");) {
			int data;
			byte[] byteArr = new byte[1024];
			while ((data = in.read(byteArr)) != -1) {
				out.write(byteArr, 0, data);
			}
		}
	}
}
