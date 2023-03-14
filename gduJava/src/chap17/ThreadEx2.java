package chap17;

public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" 스레드 시작");
		Thread t1 = new Thread(new Runnable1(),"first");
		Thread t2 = new Thread(new Runnable2(),"second");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+" 스레드 종료");
	}

}

class Runnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+"="+Thread.currentThread().getName());
		}
	}
	
}

class Runnable2 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+"="+Thread.currentThread().getName());
		}
	}
	
}
