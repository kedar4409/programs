package practice.io;

import java.io.*;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\Users\\Kedar10\\Desktop\\BufferedReaderWriter.java");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("C:\\Users\\Kedar10\\Desktop\\Copy.java");
				BufferedWriter bw = new BufferedWriter(fw);) {
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}