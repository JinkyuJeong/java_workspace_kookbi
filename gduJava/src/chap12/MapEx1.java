package chap12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<names.length ; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("김삿갓의 전화번호 : " + map.get("김삿갓"));
		System.out.println("홍길동의 전화번호 : " + map.get("홍길동"));
		System.out.println("길동의 전화번호 : " + map.get("길동"));
		
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> e : entry) {
			System.out.println(e);
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("map 객체의 요소 갯수 : " + map.size());
		Integer tel = map.remove("홍길동");
		System.out.println(tel + "번호 삭제");
		System.out.println("map 객체의 요소 갯수 : " + map.size());
	}

}
