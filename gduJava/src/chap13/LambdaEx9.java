package chap13;

import java.util.function.Predicate;

public class LambdaEx9 {
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계"),
			new Student("임꺽정", 65, 70, "전자"),
			new Student("김길수", 55, 10, "컴공")
	};
	public static void main(String[] args) {
		System.out.println("영어 점수가 60이상인 학생의 영어 평균 : " + avgEng(t->t.getEng()>=60));
		System.out.println("컴공과 학생의 영어 평균 : " + avgEng(t->t.getMajor().equals("컴공")));
		System.out.println("컴공과 학생이 아닌 영어 평균 : " + avgEng(t->!t.getMajor().equals("컴공")));
		System.out.println("수학 점수가 60이상인 학생의 영어 평균 : " + avgEng(t->t.getMath()>=60));
		System.out.println("수학 점수가 60이상인 학생의 수학 평균 : " + avgMath(t->t.getMath()>=60));
		System.out.println("컴공과 학생의 명단 : " + nameList(t->t.getMajor().equals("컴공")));
		System.out.println("컴공과 학생이 아닌 명단: " + nameList(t->!t.getMajor().equals("컴공")));
		System.out.println("영어점수가 80점 이상인 학생의 명단 : " + nameList(t->t.getEng()>=80));
		System.out.println("수학점수가 80점 이상인 학생의 명단 : " + nameList(t->t.getMath()>=80));
		
	}
	private static String nameList(Predicate<Student> p) {
		StringBuffer name = new StringBuffer();
		for(Student s : list) {
			if(p.test(s)) 
				name.append(s.getName()+", ");
			
		}
		return name.toString();
	}
	private static double avgEng(Predicate<Student> p) {
		int sum=0, cnt=0;
		for(Student s : list) {
			if(p.test(s)) {
				sum+=s.getEng();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	private static double avgMath(Predicate<Student> p) {
		int sum=0, cnt=0;
		for(Student s : list) {
			if(p.test(s)) {
				sum+=s.getMath();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
}
