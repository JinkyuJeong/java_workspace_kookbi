package chap14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		System.out.println(c1+", "+c2);
		ois.close();
	}

}
