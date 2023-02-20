package chap7;

import java.util.Date;
import java.util.Scanner;

public class PackageEx1 {

	public static void main(String[] args) {
		Pack1 p = new Pack1();
		p.method();
	
	}

}
class Pack1 {
	void method() {
		System.out.println("chap7.Pack1 클래스의 method() 메서드");
		Scanner sc = new Scanner(System.in);
		Date d = new Date(0);
	}
}