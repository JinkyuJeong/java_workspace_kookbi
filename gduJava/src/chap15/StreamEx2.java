package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 60, 70), 
								new Student("김삿갓", 65, 55), new Student("이몽룡", 80, 75), new Student("임꺽정", 85, 65));
		Stream<Student> st = list.stream();
		st.forEach(s->{
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum/2.0;
			System.out.printf(", 총점=%-4d, 평균=%.2f\n",sum,avg);
		});
		System.out.println("================================");
		list.stream().forEach(System.out::println);
		System.out.println("================================");
		System.out.println("수학점수 총점 : " + list.stream().mapToInt(Student::getMath).sum());
		System.out.println("영어점수 총점 : " + list.stream().mapToInt(Student::getEng).sum());
		System.out.println("인원 수 : " + list.stream().count()+"명");
	}

}

class Student{
	private String name;
	private int eng;
	private int math;
	public Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}

	@Override
	public String toString() {
		return "name=" + name + ", eng=" + eng + ", math=" + math;
	}
}
