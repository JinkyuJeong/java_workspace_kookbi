package chap13;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaEx7 {
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	public static void main(String[] args) {
		System.out.print("학생이름 : ");
		for(Student s : list) System.out.print(s.getName()+", ");
		System.out.println();
		System.out.print("학생이름 : ");
		printString(Student::getName);
		System.out.print("전공이름 : ");
		printString(Student::getMajor);
		System.out.print("수학점수 : ");
		printString((s)->s.getMath()+"");
		System.out.print("영어점수 : ");
		printString((s)->s.getEng()+"");
		System.out.print("학생이름(총점) : ");
		printString((s)->s.getName()+"("+(s.getMath()+s.getEng())+")");
		System.out.print("학생들의 영어 점수 합계 : ");
		printTot(Student::getEng);
		System.out.print("학생들의 수학 점수 합계 : ");
		printTot((s)->s.getMath());
		System.out.print("학생들의 전체 점수 합계 : ");
		printTot((s)->s.getMath()+s.getEng());
	}
	static void printString(Function<Student, String> f) {
		for(Student s : list) System.out.print(f.apply(s)+", ");
		System.out.println();
	}
	static void printTot(ToIntFunction<Student> f) {
		int sum=0;
		for(Student s : list) sum+=f.applyAsInt(s);
		System.out.println(sum);
	}
}
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math,  String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public String getMajor() {return major;}
}