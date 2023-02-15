package chap6;

public class Exam3 {

	public static void main(String[] args) {
		int totArea=0;
		int totLength=0;
		Rect4[] rArr = new Rect4[5];
		for(int i=0;i<5;i++) {
			rArr[i] = new Rect4();
			rArr[i].width =(int)(Math.random()*31)+20; 
			rArr[i].height =(int)(Math.random()*31)+20; 
			rArr[i].seriaNo = ++Rect4.sno;
			System.out.println(rArr[i]);
			totArea+=rArr[i].area();
			totLength+=rArr[i].length();
		}
		System.out.println("만든 사각형의 면적 합 : "+totArea);
		System.out.println("만든 사각형의 둘레 합 : "+totLength);
		
	}
}

class Rect4{
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
