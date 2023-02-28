package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "홍길동", "컴퓨터공학"));
		list.add(new Student(2, "김삿갓", "경영학"));
		list.add(new Student(3, "이몽룡", "통계학"));
		System.out.println("1 : " +list);
		Collections.sort(list);
		System.out.println("2 : " +list);
		Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
		System.out.println("3 : " +list);
		Collections.sort(list, (s1, s2) -> s1.major.compareTo(s2.major));
		System.out.println("4 : " +list);
	}

}

class Student implements Comparable<Student>{
	int studno;
	String name;
	String major;
	
	public Student(int studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public int compareTo(Student s) {
		return this.studno - s.studno;
	}
	@Override
	public String toString() {
		return "[학번=" + studno + ", 이름=" + name + ", 전공=" + major + "]";
	}
	
}
