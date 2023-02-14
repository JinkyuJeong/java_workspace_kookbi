package chap6;

public class Exam2 {
	public static void main(String[] args) {
		Rect2 r1 = new Rect2();
		r1.width=10; r1.height=20;
		r1.sno = ++Rect2.cnt;
		System.out.println(r1);
		r1.area();
		r1.length();
		Rect2 r2 = new Rect2();
		r2.width=20; r2.height=30;
		r2.sno = ++Rect2.cnt;
		System.out.println(r2);
		r2.area();
		r2.length();
	}

}

class Rect2 {
	int width,height,sno;
	static int cnt;
	void area() {
		System.out.println("면적 : " + width*height);
	}
	void length() {
		System.out.println("둘레 : " + 2*(width+height));
	}
	public String toString() {
		return sno+"번 사각형 : 가로(" + width +"), 세로(" + height+"), 현재까지 생성된 사각형("+cnt+")";
	}
}
