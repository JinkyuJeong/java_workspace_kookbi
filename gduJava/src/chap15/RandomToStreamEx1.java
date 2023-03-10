package chap15;

import java.util.Random;

public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int형 난수 3개를 가진 스트림 생성");
		new Random().ints(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~2사이 int형 난수 10개를 가진 스트림 생성");
		new Random().ints(10,0,3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("1~100사이 int형 난수 10개를 가진 스트림 생성");
		new Random().ints(10,1,101).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("long형 난수 3개를 가진 스트림 생성");
		new Random().longs(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~9사이 long형 난수 3개를 가진 스트림 생성");
		new Random().longs(3,0,10).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("char형 난수 3개를 가진 스트림 생성");
		new Random().ints(3,'A','z'+1).forEach(s->System.out.print((char)s+" "));
		System.out.println();
		System.out.println("double형 난수 3개를 가진 스트림 생성");
		new Random().doubles(3).forEach(s->System.out.print(s+" "));
	}

}
