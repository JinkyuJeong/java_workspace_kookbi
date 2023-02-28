package chap12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동",10));
		set.add(new Person("홍길동",10));
		set.add(new Person("홍길동",20));
		set.add(new Person("홍길순",10));
		System.out.println(set);
	}
}

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return age == p.age && Objects.equals(name, p.name);
		}else return false;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + age + ")";
	}
}
