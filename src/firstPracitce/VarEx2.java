package firstPracitce;
// byte , short , int ,long = 정수형 1	Long 접미사 L
// char = 문자형 '가'			
// float , double = 실수형 3.14		접미사 f,d
// boolean = 논리형 = boolean
// 변수 = 하나의 값을 저장하기 위한 공간
// 상수 = 한 번만 값을 저장 가능한 변수
// 리터럴 = 그 자체로 값을 의미하는 것 접미사로 형태를 맞춰워야함

// final int MAX =100; 상수를 만들기 위해선 뒤에 final을 입력


public class VarEx2 {

	public static void main(String[] args) {
		int i = 100;
		int oct = 010 ;//8진수;
		int hex = 0x100 ;//16진수;
		long l = 10_000_000_000L; 	//100억 int의 최대는 약 20억
		float f = 3.14f ;
		double d = 3.14f ;	//double 에 d는 생략 가능
		final int score= 100;
		
		System.out.println(score);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(f);
		System.out.println(d);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}

}
