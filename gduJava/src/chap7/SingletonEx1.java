package chap7;

public class SingletonEx1 {

	public static void main(String[] args) {
		SingleObject o = SingleObject.getObject();
		SingleObject o2 = SingleObject.getObject();
		System.out.println(o.value);
		System.out.println(o2.value);
		o.value =200;
		System.out.println(o.value);
		System.out.println(o2.value);
	}

}

class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}