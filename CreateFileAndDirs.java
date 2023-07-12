package practice.io;

import java.io.*;

public class CreateFileAndDirs {
	public static void main(String[] args) throws IOException {
		File dirs = new File("C:\\Users\\Kedar10\\Desktop");
		System.out.println(dirs.mkdirs());
		File file = new File(dirs, "ExampleText.txt");
		if (!file.exists())
			System.out.println(file.createNewFile());
	}
}
