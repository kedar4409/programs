package practice.io;

import java.io.*;

import java.io.*;

public class WriteObject {
	public static void main(String args[]) throws Exception {
		try (FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectOutputStream oos = new ObjectOutputStream(out);
				FileInputStream in = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectInputStream ois = new ObjectInputStream(in);) {
			Car c = new Car();
			oos.writeObject(c);
			oos.flush();
			Car c2 = (Car) ois.readObject();
			System.out.println(c2);
		}
	}
}


class Car {
}