/*
 * 메소드 오버로드
 *  - 메소드의 이름이 같고 매개변수가 다른것
 *  - 매개변수가 틀린다는 말은, 자료형이 다르거나
 *  매개변수의 개수가 다르거나 자료형 순서가 다른것을 의미
 *  - 반환형은 다르지 않음
 * 
 * 메소드 재귀호출
 * - 메소드 내에서 자신을 또 호출 할 때
 * 주의할 점은 반드시 종료 시점이 있어야 함
 */


package ArrayMethod;

import java.util.Scanner;


public class MethodOverLoad {
	public static void main (String args[]) {
		//팩토리얼 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("팩토리얼의 수를 입력해주세요 : ");
		int fac = sc.nextInt();
		System.out.printf("%d 의 팩토리얼 결과값은 %d 입니다.\n",fac,factorial(fac));
	}
	
	public static int factorial(int n) {
		if(n==1) return 1;
		
		return n *factorial(n-1);
		
	}
}
