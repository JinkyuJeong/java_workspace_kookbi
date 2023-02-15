package test6;
/*
 * 다음의 결과가 나오도록 Student 클래스 구현하기
 * [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
=====================
 */
class Student {
	int studNo;
	String name;
	int kor, eng, math;
	
	public Student(String name, int no) {
		this.studNo = no;
		this.name = name;
	}
	public Student(String name, int no, int kor, int eng, int math) {
		this.studNo = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void info() {
		System.out.printf("학번:%d\n이름:%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n평균:%.1f\n=====================\n",
									studNo, name, kor, eng, math,(kor+eng+math),(float)(kor+eng+math)/3);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	}

}
