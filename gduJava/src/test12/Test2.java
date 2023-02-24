package test12;

/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
가나

 */
public class Test2 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}

	static String format (String str, int len, int align) {
		switch(align) {
			case 0 : {
				if(str.length()>len) str = str.substring(0,len);
				str = String.format("%-" +len+"s", str);
			}break;
			case 1 :{
				int half = (len-str.length())/2;
				StringBuffer sb =new StringBuffer(str);
				for(int i=0; i<half ;i++) {
					sb.insert(i," ");
					sb.insert(str.length()+1+i," ");
				}
				str = String.format("%s", sb.toString());
			}break;
			case 2 :{
				str = String.format("%" +len+"s", str);
			}break;
		}
		return str;
	}
}



