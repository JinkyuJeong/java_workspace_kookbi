package chap14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamEx4  {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		User u1 = (User)ois.readObject();
		User u2 = (User)ois.readObject();
		System.out.println(u1+", "+u2);
	}

}
