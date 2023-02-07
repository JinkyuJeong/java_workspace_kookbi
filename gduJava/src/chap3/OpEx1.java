package chap3;

public class OpEx1 {

	public static void main(String[] args) {
		int x=5, y=5;
		x++;		// x의 값을 1 증가
		y--;		// y의 값을 1 감소
		System.out.println("x="+x+", y="+y);
		++x;
		--y;
		System.out.println("x="+x+", y="+y);
		x=y=5;
		y= ++x;
		System.out.println("x="+x+", y="+y);
		y= x++;
		System.out.println("x="+x+", y="+y);
		System.out.println("x="+ x++);
		System.out.println("x="+ ++x);
	
	}

}
