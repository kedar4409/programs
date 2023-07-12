package practice.io;

import java.io.*;

public class ParentNotSerializable {
	public static void main(String args[]) throws Exception {

		try (FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectOutputStream oos = new ObjectOutputStream(out);
				FileInputStream in = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectInputStream ois = new ObjectInputStream(in);) {
			Car2 c = new Car2();
			oos.writeObject(c);
			oos.flush();
			Car2 c2 = (Car2) ois.readObject();
			System.out.println(c2.name + ":" + c2.model);
		}
	}
}

class Vehicle {
	String name = "Vehicle";
}

class Car2 extends Vehicle implements Serializable {
	String model = "Luxury";
}
