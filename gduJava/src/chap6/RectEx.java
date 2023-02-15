package chap6;

public class RectEx {

	public static void main(String[] args) {
		Rect3 r1 = new Rect3();
		r1.width =30; r1.height =20;
		r1.seriaNo = ++Rect3.sno;
		System.out.println(r1);
		Rect3 r2 = new Rect3();
		r2.width =35; r2.height =25;
		r2.seriaNo = ++Rect3.sno;
		System.out.println(r2);
		Rect3 r3 = new Rect3();
		r3.width =25; r3.height =25;
		r3.seriaNo = ++Rect3.sno;
		System.out.println(r3);
	}

}

class Rect3{
	int width, height, seriaNo;
	static int sno;
	int area() {
		return width *height;
	}
	int length() {
		return (width+height)*2;
	}
	boolean isSquare() {
		return width==height ? true : false;
	}
	public String toString() {
		return seriaNo + "번 사각형 : (" + width +","+height +")"+
					"생성된 사각형 갯수 : " + sno + "=>면적 : " +area() + ", 둘레 : " +this.length()
					+ (this.isSquare() == true ? " 정사각형" : " 직사각형");
	}
}
