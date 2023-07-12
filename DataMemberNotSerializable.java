package practice.io;

import java.io.*;

public class DataMemberNotSerializable {
	public static void main(String args[]) throws Exception {
		try (FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectOutputStream oos = new ObjectOutputStream(out);) {
			Car4 c = new Car4();
			oos.writeObject(c);
			oos.flush();
		}
	}
}

class Engine {
	String make = "198768";
}

class Car4 implements Serializable {
	String model = "Luxury";
	Engine engine = new Engine();
}
