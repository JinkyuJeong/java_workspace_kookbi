package chap12;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx3 {
	private static SortedSet<String>set = new TreeSet<>();

	public static void main(String[] args) {
		String from = "bat";
		String to = "d";
		addSet();
		System.out.println(set);
		System.out.println("from : " + from + ", to : " + to );
		System.out.println(set.subSet(from, to));
		System.out.println("from : " + from + ", to : " + to +"zzzz" );
		System.out.println(set.subSet(from, to+"zzzz"));
		System.out.println("역순으로 정렬하기");
		set = new TreeSet<>(Comparator.reverseOrder());
		addSet();
		System.out.println(set);
		System.out.println("대소문자 구분없이 정렬하기");
		set = new TreeSet<>((s1,s2) -> s1.compareToIgnoreCase(s2));
		addSet();
		System.out.println(set);
	}
	
	private static void addSet() {
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dzzzz"); set.add("dZZZZ");
		set.add("elev"); set.add("fan"); set.add("flower");
	}
}
