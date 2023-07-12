package practice.io;

import java.io.*;

public class ReadChars {
	public static void main(String[] args) throws IOException {
		try (FileReader input = new FileReader("src\\practice\\io\\ReadChars.java");
				FileWriter output = new FileWriter("src\\practice\\io\\CopyReadChars.java");) {
			int data;
			while ((data = input.read()) != -1) {
				output.write(data);
			}
			System.out.println("Executed");
		}
	}
}