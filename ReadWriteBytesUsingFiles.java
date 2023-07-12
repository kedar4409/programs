package practice.io;

import java.io.*;

public class ReadWriteBytesUsingFiles {
	public static void main(String[] args) throws IOException {
		// Create file Sample.txt or Sample.pdf on given location
		try (FileInputStream in = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\Sample.txt");
				FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\Sample2.txt");) {
			int data;
			while ((data = in.read()) != -1) {
				out.write(data);
			}
		}
	}
}
