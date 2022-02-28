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
 * "3.4" -->3.4
 * Double.parseDouble("3.4")
 * 
 * 문자열을 문자로 변환
 * "3" --> '3'
 * charAt('3')
 * 
 * 문자를 숫자로 변환
 * '3' - '0' = 3
 * 
 * 
 */




public class typechangeEx {

	public static void main(String[] args) {
		String str ="3";
		
		System.out.println(str.charAt(0));
		System.out.println('3' -'0' +1);
		System.out.println(Integer.parseInt(str) +1 );
		System.out.println("3" + 1 ); // 1이 "1" 로 바뀜
		System.out.println( 3 + '0');
		
		
		
	}

}
