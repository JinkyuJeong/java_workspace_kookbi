package chap2;

public class Test1 {

	public static void main(String[] args) {
		 //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
        char       a='a';   
	    //char       b="a";    큰따옴표는 문자열을 의미하기 때문에 오류가난다. 
	    String     c="a";   
	    //String     d='a'; 		문자열은 큰따옴표로 선언해야한다.
	    //char       e='ab';    char형은 하나의 문자만 선언 가능하다.
	    String     f="ab"; 
	    //char       g = '';		char형은 빈 문자를 선언할 수 없다.
	    String     h = ""; 

	    //byte   var1 = 128; 		byte형 숫자 표현 범위는 -128~127 이다.
		short  var2 = 128; 
		int    var3 = (int)28L;		// L이 붙은건 long형이기 때문에 (int)로 형변환을 한다.
		long   var4 = 128L;
		float  var5 = 1.2f;  		// float형이므로 f를 명시해준다.
		double var6 = 1.2; 
	    float var9 = '1';   
	}
}

/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오.
      변수이름으로 사용할 수 없는 이유를 작성하시오
      A. false
      B. default  --> 예약어라서 안됨
      C. _var
      D. a-class --> _, $를 제외한 특수문자가 들어가 있음
      
      답 : A, C
      
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.
    A. s#arp  
    B. static  
    C. _class 
    D. class 
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
     
 
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F; 
   B. float f2 = 1.0; 
   C. float f3 = '1';  
   D. float f4 = "1";  
   E. float f5 = 1.0d;      
*/
