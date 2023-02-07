package chap2;
public class VarEx4 {
	public static void main(String[] args) {
		long l =100;
		double d = l;
		System.out.println(d);
		
		long l1 = 1000;
		long l2 = 1000l;
		double d1 = 10.5;		
		float f1 =(float)10.5;		// 실수타입의 리터럴 기본 자료형은 double임
		float f2 = 10.5f; 			// f 접미사를 이용하여 float타입의 리터럴값을 저장
	}
}
