package chap12;

import java.util.Set;
import java.util.TreeSet;

public class Exam4 {

	public static void main(String[] args) throws InterruptedException {
		Set<Integer> set = new TreeSet<>();
		while(set.size()!=6) {
			set.add((int)(Math.random()*45)+1);
			System.out.println(set);
			Thread.sleep(1000);
		}
		System.out.println("결과 : " + set);
	}

}
