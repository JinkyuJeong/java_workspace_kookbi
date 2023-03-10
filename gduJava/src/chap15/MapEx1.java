package chap15;

import java.util.Arrays;
import java.util.List;

public class MapEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전","춘향전","구운몽","전우치전");
		list.stream().mapToInt(String::length).forEach(s->System.out.print(s+", "));
		List<Student> list2 = Arrays.asList(new Student("홍길동", 80, 95), 
				new Student("김삿갓",70, 75), new Student("이몽룡", 75, 70));
		System.out.println("\n영어점수 목록 : ");
		list2.stream().mapToInt(Student::getEng).forEach(s->System.out.print(s+", "));
		System.out.println("\n수학점수 목록 : ");
		list2.stream().mapToInt(Student::getMath).forEach(s->System.out.print(s+", "));
		System.out.println("\n합계점수 목록 : ");
		list2.stream().mapToInt(s->s.getMath()+s.getEng()).forEach(s->System.out.print(s+", "));
		System.out.println("\n수학 점수 합계 : " + list2.stream().mapToInt(s->s.getMath()).sum());
		System.out.println("수학 점수 평균 : " + list2.stream().mapToInt(s->s.getMath()).average().getAsDouble());
		System.out.println("영어 점수 합계 : " + list2.stream().mapToInt(s->s.getEng()).sum());
		System.out.println("영어 점수 평균 : " + list2.stream().mapToInt(s->s.getEng()).average().getAsDouble());
		System.out.println("점수 합계 : " + list2.stream().mapToInt(s->s.getMath()+s.getEng()).sum());
		System.out.println("점수 평균 : " + list2.stream().mapToInt(s->s.getMath()+s.getEng()).average().getAsDouble());
	}

}
