package ArrayMethod;

import java.util.Scanner;


/*	필요할때	필요할때	필수		필수	   필수
 * 접근제한자 지정예약어 반환형 메소드명 (매개변수)
 * 								예외전가{....}
 * 
 * 
 * 접근제한자 
 * private (자신의 클래스에서만 사용되도록 제한)
 * default (동일한 폴더에서만 사용되도록 제한)
 * protected (동일한 폴더 + 상속받은 클래스로 제한)
 * public (객체가 선언된 곳이면 어디에서든 사용)
 * 
 * 
 * 반환형
 * 기본자료형 	int double
 * 참조자료형	class를 객체화
 * void - 반환형이 없을 때 사용
 * 
 * 매개변수
 * 메소드 사용시 필요한 값을 받을 수 있는 곳
 * 
 * 예외전가
 * 예와가 발생하여 전가를 시키고자 할 때
 * 
 * 메소드 호출시 인풋(매개변수)은 0~ 여러개가 가능하고
 * 			  아웃풋은 무조건 1개이다.
 * 
 * 
 * main 메소드 구성		매개변수,메소드에 건네지는 데이터	예외처리
 * public static void main(String[] args) throws IOException{}
 * 접근제한자지정예약어	메소드 이름
 * 			메소드 수행 결과물의 반환 자료형
 */
public class MethodEx1 {

	public static void main(String[] args) {
		int a  = input();
		int b = input();
		int sum = plus( a , b);
		output(sum);
		

	}
	public static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수를 입력 : ");
		int su = sc.nextInt();
		return su;
	}
	
	public static int plus (int su1 ,int su2 ) {
		return su1 + su2;
	}
	
	public static void output(int sum) {
		System.out.println("입력하신 수의 합 : "+ sum );
	}
}

	






















