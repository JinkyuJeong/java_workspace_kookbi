package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamEx3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "5678", 30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println(u1+", "+u2);
	}

}

class UserInfo{
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("[%s, %s]", name,password);
	}
}

class User extends UserInfo implements Serializable{
	private int age;

	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", name,password,age);
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}
