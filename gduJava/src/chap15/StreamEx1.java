package chap15;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","김삿갓","이몽룡");
		System.out.println("iterator 방식");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) System.out.print(it.next() + ", ");
		
		System.out.println("\nstream방식");
		list.stream().forEach((name)->System.out.print(name+", "));
	}

}
