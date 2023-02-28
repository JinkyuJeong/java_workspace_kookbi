package test14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.
  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성

  [결과]
3등 복권 추첨합니다.
369,355,699,
2등 복권 추첨합니다.
280,920,
1등 복권 추첨합니다.
839,
 *** 복권 추첨 결과 ***
1등:839
2등:920,280,
3등:699,355,369,
===========
1등:[839]
2등:[280, 920]
3등:[355, 369, 699]
 */
public class Test3 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		Random rand = new Random();
		int i=0;
		while(i!=6) {
			set.add(rand.nextInt(999)+1);
			i++;
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<>(set);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		System.out.println("3등 복권 추첨합니다.");
		for(i=0;i<list.size()-3;i++) {
			System.out.print(list.get(i)+", ");
			list3.add(list.get(i));
		}
		System.out.println();
		System.out.println("2등 복권 추첨합니다.");
		for(i=i;i<list.size()-1;i++) {
			System.out.print(list.get(i)+", ");
			list2.add(list.get(i));
		}
		System.out.println();
		System.out.println("1등 복권 추첨합니다.");
		System.out.println(list.get(i)); list1.add(list.get(i));
		System.out.println("*** 복권 추첨 결과 ***");
		System.out.println("1등 : " + list1.get(0));
		System.out.print("2등 : ");
		for(int num : list2)
			System.out.print(num + ", ");
		System.out.print("\n3등 : ");
		for(int num : list3)
			System.out.print(num + ", ");
		System.out.println("\n===========");
		System.out.println("1등 : " +list1);
		System.out.println("2등 : " +list2);
		System.out.println("3등 : " +list3);


	}
}
