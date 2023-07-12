package practice.io;

import java.io.*;

public class ReadWriteObject {
	public static void main(String args[]) throws Exception {
		try (FileOutputStream out = new FileOutputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectOutputStream oos = new ObjectOutputStream(out);
				FileInputStream in = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectInputStream ois = new ObjectInputStream(in);) {
			Car1 c = new Car1();
			oos.writeObject(c);
			oos.flush();
			Car1 c2 = (Car1) ois.readObject();
			System.out.println(c2);
		}
	}
}


class Car1 implements Serializable {
}