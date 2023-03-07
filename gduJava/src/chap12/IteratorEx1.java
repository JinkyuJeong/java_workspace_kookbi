package chap12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i=1 ; i<=5; i++) {
			list.add(i+10);
			set.add(i*10);
		}
		Iterator it = list.iterator();
		print(it);
		it = set.iterator();
		print(it);
		System.out.println("print() 이후 list : " + list);
		System.out.println("print() 이후 set : " + set);
	}
	
	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
