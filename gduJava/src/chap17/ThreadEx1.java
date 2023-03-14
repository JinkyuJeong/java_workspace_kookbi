package chap17;

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread t1 = new Thread1("First");
		Thread t2 = new Thread1("Second");
		t1.start();
		t2.start();
		System.out.println("main 스레드 종료");
	}

}

class Thread1 extends Thread{
	public Thread1(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+"="+super.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}	