package chap6;

public class LocalValEx1 {
	public static void main(String[] args) {
		int num;
		//		System.out.println(num);
		boolean b = true;
		if(b) {
			num=100;
		}else {
			num=200;
		}
		System.out.println(num);
		int num2=0;
		if(b) {
			num2=100;
		}
		System.out.println(num2);
		String grade="";
		int score = 85;
		switch(score/10) {
			case 9 : grade ="A"; break;
			case 8 : grade ="B";break;
			case 7 : grade ="C";break;
//			default : grade="F";
		}
		System.out.println(grade + "학점");
		
		
	}
}
