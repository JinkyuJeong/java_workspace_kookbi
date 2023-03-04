package test14;

// 괄호 체크

import java.util.Stack;

public class Test9 {

	public static void main(String[] args) {
		solution("(((( )))");
	}
	
	static void solution(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') st.push(c);
			try {
				if(c == ')' ) st.pop();
			} catch (Exception e) {
				System.out.println("괄호의 갯수가 틀립니다. (닫는괄호가 더 많음)");
				return;
			}
		}
		
		if(st.empty()) System.out.println("괄호의 갯수가 맞습니다.");
		else System.out.println("괄호의 갯수가 틀립니다. (여는괄호가 더 많음)");
		
	}
	
}
