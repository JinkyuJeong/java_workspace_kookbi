package chap12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx1 {

	public static void main(String[] args) {
		String[] cars = {"소나타", "그랜저", "SM5", "K9"};
		Stack<String> st = new Stack<>();
		Queue<String> q = new LinkedList<>(); 
		for(String s : cars) {
			st.push(s);
			q.offer(s);
		}
		System.out.println("스택에 저장된 객체의 갯수 : " + st.size());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("스택에 저장된 객체의 갯수 : " + st.size());
		System.out.println("큐에 저장된 객체의 갯수 : " + q.size());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println("큐에 저장된 객체의 갯수 : " + q.size());
	}

}
