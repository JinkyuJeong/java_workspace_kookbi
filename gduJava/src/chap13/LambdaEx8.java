package chap13;

import java.util.function.IntBinaryOperator;

public class LambdaEx8 {
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	public static void main(String[] args) {
		System.out.print("최대 수학 점수 : ");
		System.out.println(maxOrMinMath((a,b)->a>=b? a:b));
		System.out.print("최소 수학 점수 : ");
		System.out.println(maxOrMinMath((a,b)->a<=b? a:b));
		System.out.print("최대 영어 점수 : ");
		System.out.println(maxOrMinEng((a,b)->a>=b? a:b));
		System.out.print("최소 영어 점수 : ");
		System.out.println(maxOrMinEng((a,b)->a<=b? a:b));
		System.out.print("최대 합계 점수 : ");
		System.out.println(maxOrMinTot((a,b)->a>=b? a:b));
		System.out.print("최소 합계 점수 : ");
		System.out.println(maxOrMinTot((a,b)->a<=b? a:b));
	}
	static int maxOrMinMath(IntBinaryOperator io) {
		int result = list[0].getMath();
		for(Student student : list) 
			result = io.applyAsInt(result, student.getMath());
		return result;
	}
	static int maxOrMinEng(IntBinaryOperator io) {
		int result = list[0].getEng();
		for(Student student : list) 
			result = io.applyAsInt(result, student.getEng());
		return result;
	}
	static int maxOrMinTot(IntBinaryOperator io) {
		int result = list[0].getEng()+list[0].getMath();
		for(Student student : list) 
			result = io.applyAsInt(result, student.getEng()+student.getMath());
		return result;
	}

}
