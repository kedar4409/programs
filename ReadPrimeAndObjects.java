package practice.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.OptionalDataException;

public class ReadPrimeAndObjects {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		try (FileInputStream in = new FileInputStream("C:\\Users\\Kedar10\\Desktop\\object.data");
				ObjectInputStream ois = new ObjectInputStream(in);) {
			System.out.println(ois.readBoolean());

			// Deserialize the object with different fields or object structure
			Car5Modified c = (Car5Modified) ois.readObject();
			System.out.println(c.model);
		} catch (OptionalDataException e) {
			System.out.println("OptionalDataException: " + e.getMessage());
		}
	}
}

class Car5Modified implements Serializable {
	// Modified field or changed object structure
	String model;

	Car5Modified(String value) {
		model = value;
	}
}
