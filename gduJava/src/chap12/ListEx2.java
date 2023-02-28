package chap12;

import java.util.Vector;

/*
 * Vector 클래스
 * 	- Collection 프레임워크 이전 클래스
 * 	- List 인터페이스의 구현클래스
 * 	- 이전에 사용된 메서드와 List를 구현한 메서드가 함께 존재함
 * */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.add(5.0);
		System.out.println(list);
		
		double num = 5.0;
		int index = list.indexOf(num);
		if(index<0) System.out.println(num+ "은 list에 없는 요소입니다.");
		else System.out.println(num + "의 위치 : " + index);
		
		if(list.contains(num)) System.out.println(num+"은 존재함");
		
		list.remove(0.3);
		System.out.println(list);
	}

}
