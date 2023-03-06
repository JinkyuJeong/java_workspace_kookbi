package chap12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("나라이름을 입력 : ");
			String nara = sc.nextLine();
			if(nara.equals("종료")) {
				System.out.println(map);
				break;
			}
			
			if(map.get(nara) == null) {
				System.out.println("등록된 나라가 아님."); 
				System.out.print("해당 나라의 수도를 입력하세요 : ");
				String sudo = sc.nextLine();
				map.put(nara, sudo);
			}else {
				System.out.println(nara+"의 수도는 " + map.get(nara));
			}
		
		}
		System.out.println("종료");
		sc.close();
	}
}
