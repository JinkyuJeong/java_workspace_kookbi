package chap10;

import javax.swing.JOptionPane;

public class ExceptionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = JOptionPane.showInputDialog("에러메세지 입력하세요");
			throw new Exception(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
