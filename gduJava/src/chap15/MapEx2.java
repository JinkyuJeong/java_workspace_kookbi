package chap15;

import java.util.Arrays;
import java.util.List;

public class MapEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 80, 95), 
				new Student("김삿갓",70, 75), new Student("이몽룡", 75, 70));
		int sum = list.stream().mapToInt(Student::getEng).peek(s->System.out.print(s+", ")).sum();
		System.out.println("\n영어합계 : " + sum);
		System.out.println("=================================");
		sum = list.stream().mapToInt(Student::getMath).peek(s->System.out.print(s+", ")).sum();
		System.out.println("\n수학합계 : " + sum);
		System.out.println("=================================");
		sum = list.stream().mapToInt(s->s.getMath()+s.getEng()).peek(s->System.out.print(s+", ")).sum();
		System.out.println("\n전체합계 : " + sum);
		
	}

}
