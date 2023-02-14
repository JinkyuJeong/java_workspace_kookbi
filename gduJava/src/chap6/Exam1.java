package chap6;

public class Exam1 {

	public static void main(String[] args) {
		Rect r1 = new Rect();
		r1.width = 10;
		r1.height = 5;
		r1.area();
		r1.length();
	}

}

class Rect {
	int width;
	int height;
	void area() {
		System.out.println(width*height);
	}
	void length() {
		System.out.println(2*width+2*height);
	}
}
