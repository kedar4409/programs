package practice.io;

import java.io.*;

public class CreateFileAndDirs2 {
	public static void main(String[] args) throws IOException {
		File dirs = new File("D:");
		System.out.println(dirs.mkdirs());
		File file = new File(dirs, "*&^%$.yu");
		if (!file.exists())
			System.out.println(file.createNewFile());
	}
}
