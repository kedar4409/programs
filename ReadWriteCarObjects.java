package practice.io;

import java.io.*;

public class ReadWriteCarObjects {
	public static void main(String args[]) throws Exception {
		try (FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectOutputStream oos = new ObjectOutputStream(out);
				FileInputStream in = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectInputStream ois = new ObjectInputStream(in);) {
			Car6 c = new Car6("AAA");
			oos.writeObject(c);
			oos.flush();
			new Car6("BBB");
			Car6 c2 = (Car6) ois.readObject();
			System.out.println(c2.name);
			System.out.println(c2.model + ":" + c2.days);
			System.out.println(c2.carCount);
		}
	}
}

class Car6 implements Serializable {
	String name;
	transient String model;
	transient int days;
	static int carCount;

	Car6(String value) {
		name = value;
		model = "some value";
		days = 98;
		++carCount;
	}
}