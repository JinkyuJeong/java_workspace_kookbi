package chap7;

abstract class Shape{
	String type;
	public  Shape(String type) {
		this.type = type;
	}
	abstract double area();
	abstract double length();
}

class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI *r*r;
	}
	@Override
	double length() {
		return Math.PI *r*2;
	}
	public String toString() {
		return type +":"+r+"=>면적:"+area()+"둘레:"+length();
	}
}

class Rectangle extends Shape{
	int width,height;
	public Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return this.width*this.height;
	}
	@Override
	double length() {
		return 2*(this.width+this.height);
	}
	@Override
	public String toString() {
		return type +":"+width+","+height+"=>면적:"+area()+"둘레:"+length();
	}
}

public class ShapeEx1 {

	public static void main(String[] args) {
		Shape[] arr = new Shape[2];
		arr[0]= new Circle(10);
		arr[1]= new Rectangle(10,10);
		double totArea =0, totLength =0;
		for(Shape s : arr) {
			System.out.println(s);
			totArea += s.area();
			totLength += s.length();
		}
		System.out.println("전체 면적 : "+totArea);
		System.out.println("전체 둘레 : "+totLength);
	}

}
