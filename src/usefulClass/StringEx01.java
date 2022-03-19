package usefulClass;
/*
 * String Class
 * - 문자열을 저장하기 위해 문자형 배열 변수를 인스턴스 변수로 저장해둠
 * - 생성자 생성시 매개변수로 받는 문자열은 문자열 배열에 저장되는것
 * 
 * 주요 메소드
 * 1. char charAt(int index) -지정된 인덱스의 문자를 반환
 * 2. int compareTo (String anotherString) - 2개의 캐릭터 라인을 사전적으로 비교
 * 3. int compareTolgnoreCase (String str) - 대소문자 구분없이 비교
 * 4. string concat (String str) 지정된 캐릭터 라인을 이 캐릭터 라인의 마지막에 연결
 * 5. boolean startsWith (String prefix,int toffset) 지정된 접두사로 시작될지 아닐지
 * 6. boolean endsWith	(String suffix)		접미사확인
 * 7. boolean equalsIgnoreCase (String another String)
 * 8. byte[] getBytes()	- 이 객체를 바이트 배열로 반환해줌
 * 9. byte[] getBytes(String charsetName)
 * 10. int lastindexOf(int ch)
 * 11. String substring(int beginindex) - 지정된 인
 * 12. 
 * 
 * 
 * 
 */
public class StringEx01 {

	public static void main(String[] args) {
		String str = new String("Hello Java!!");
		System.out.println("길이 : " + str.length());
		
		char ch = str.charAt(4);
		System.out.println("4번째 문자 : " + ch);
		
		System.out.println(str.substring(6,10));//6~10
		System.out.println(str.substring(6)); 	//6~
		
		byte[] by = str.getBytes();
		for(int i = 0 ; i < by.length ; i++) System.out.println((char)by[i]);
		
		
		
	}

}
