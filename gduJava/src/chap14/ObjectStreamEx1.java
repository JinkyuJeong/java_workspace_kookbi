package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamEx1 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동", 20);
		Customer c2 = new Customer("김삿갓", 30);
		oos.writeObject(c1);
		oos.writeObject(c2);
		System.out.println(c1+", "+c2);
		oos.close(); fos.close();
	}

}

class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private transient int age;
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("[%s:%d]", name,age);
	}
	
}