package chap11;
import static java.lang.Math.*;

public class MathEx1 {

	public static void main(String[] args) {
		System.out.println("Math.abs(5)="+abs(5));
		System.out.println("Math.abs(-5)="+abs(-5));
		System.out.println("Math.abs(3.14)="+abs(3.14));
		System.out.println("Math.abs(-3.14)="+abs(-3.14));

		System.out.println("Math.ceil(5.4)="+ceil(5.4));
		System.out.println("Math.ceil(-5.4)="+ceil(-5.4));
		
		System.out.println("Math.floor(5.4)="+floor(5.4));
		System.out.println("Math.floor(-5.4)="+floor(-5.4));
		
		System.out.println("Math.rint(5.4)="+rint(5.4));
		System.out.println("Math.rint(-5.4)="+rint(-5.4));
		
		System.out.println("Math.round(5.4)="+round(5.4));
		System.out.println("Math.round(5.5)="+round(5.5));
		
		System.out.println("Math.min(5,4)="+min(5,4));
		System.out.println("Math.min(5.4,5.3)="+min(5.4,5.3));
		System.out.println("Math.max(5,4)="+max(5,4));
		System.out.println("Math.max(5.4,5.3)="+min(5.4,5.3));
		
		System.out.println("Math.random()="+random());
		
		System.out.println("Math.sin(Math.PI/2)="+sin(PI/2));
		System.out.println("Math.cos(Math.toRadians(60)="+cos(toRadians(60)));
		System.out.println("Math.tan(Math.PI/4)="+tan(PI/4));
		System.out.println("Math.toDegrees(Math.PI)="+toDegrees(PI));
		
		System.out.println("Math.log(Math.E)="+log(E));
		
		System.out.println("Math.sqrt(25)="+sqrt(25));
		System.out.println("Math.pow(5)="+ pow(5,3));
		
	}

}
