package chap12;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx3 {

	public static void main(String[] args) {
		SortedSet<String>set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dzzzz"); set.add("dZZZZ");
		set.add("elev"); set.add("fan"); set.add("flower");
		System.out.println(set);
		System.out.println("from : " + from + ", to : " + to );
		System.out.println(set.subSet(from, to));
		System.out.println("from : " + from + ", to : " + to +"zzzz" );
		System.out.println(set.subSet(from, to+"zzzz"));
	}

}
