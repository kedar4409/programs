package practice.io;

import java.io.*;

public class NonBufferedBytesReadWrite {
	public static void main(String[] args) throws IOException {
		// Create file jls7.pdf on given location
		try (FileInputStream in = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\jls7.pdf");
				FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\jls7-copy.pdf");) {
			long start = System.currentTimeMillis();
			int data;
			while ((data = in.read()) != -1) {
				out.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("MilliSeconds elapsed : " + (end - start));
		}
	}
}