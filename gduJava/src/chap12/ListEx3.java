package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("f");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(3));
		list2.add(new Data(2));
		list2.add(new Data(1));
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list2, Comparator.reverseOrder());
		System.out.println(list2);
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(3));
		list3.add(new Data2(2));
		list3.add(new Data2(1));
		Collections.sort(list3,(d1, d2) -> d1.value - d2.value);
		System.out.println(list3);
	}
}

class Data implements Comparable<Data>{
	int value;
	public Data(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(Data o) {
		return this.value - o.value;
	}
	@Override
	public String toString() {
		return ""+ this.value;
	}
}

class Data2 {
	int value;
	public Data2(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return ""+this.value;
	}
}