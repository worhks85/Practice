/*
 * 문자열로 변환
 * - 3 + "" = "3"
 * - '3' + "" = "3"
 * 
 * 
 * 문자열을 숫자로 변환
 * "3" --> 3
 * Integer.parseInt("3")
 * 
 * 
 * 문자열을 더블로 변환
 * "3.4" --> 3.4
 * Double.parseDouble("3.4")
 * 
 * 문자열을 문자로 변환
 * "3" --> '3'
 * charAt('3')
 * 
 * 문자를 숫자로 변환
 * '3' - '0' = 3
 * 
 * "" + 7 + 7 = "77"
 * 7+7+"" = 14 + "" = "14"
 * 문자열 + any type = 문자열
 * 숫자 -> 문자열	
 * 
 * 문자열 -> 숫자
 * Integer.parseInt(Int)
 * 
 * 
 * 기본형 - (boolean, char , byte , short , int , long , float , double)
 * 실제 값을 저장
 * 
 * 논리형 - true 와 false 중 하나의 값으로 갖으며 저건식과 논리적 계산에 사용된다.
 * 문자형 - 문자를 저장하는데 사용 , 하나의 문자만을 저장 할 수 있다.
 * 정수형 - 정수 값을 저장하는데 사영 , 주로 사용하는것은 int 이며 long이며,
 * 		   byte는 이진 데이터를 다른데 사용
 * 			short는 c언어와의 호완을 위해 추가
 * 실수형 - 실수값을 저장하는데 사용 float 와 double이 있다.ㅑㅏ
 * 
 * 참조형 - (기본형을 제외한 나머지)
 * 메모리 주소 저장 (4byte or 8byte)
 */


public class typechangeEx {

	public static void main(String[] args) {
		/*		byte a = 10;		//1byte = -128 ~ 127
		short b = 10000;	//2byte = -2^15 ~ 2^15-1
		int c = 420000;		//4byte = -2^31 ~ 2^31-1 약 20억
		long d = 2000000L;	//8byte = -2^62 ~ 2^62-1
		char e = 'a';		//2byte = 0~2^16-1
		float f = 10.23f;	//4byte
		double g = 10.23;	//8byte	실수형의 기본 자료형
		boolean h = true;	//true or false
		String i = "study";	//문자열 자료형
*/		
		
		byte a = 10;
		char b = (char)a;
		short c = (short)b;
		char d = (char)c;
		String str ="3";
		
		System.out.println(str.charAt(0));
		System.out.println('3' -'0' +1);
		System.out.println(Integer.parseInt(str) +1 );
		System.out.println("3" + 1 ); // 1이 "1" 로 바뀜
		System.out.println( 3 + '0');
		
		
		
	}

}
