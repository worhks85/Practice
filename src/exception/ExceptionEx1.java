package exception;
/*
 * 예외란?
 * - 실행중 오작동이 발생하는 경우
 * - 실행 경과에 악형향을 미치는 경우
 * - 에러는 아님 사용자의 잘못된 입력등등
 * 
 * 예외 상황 종류
 * - throw : 강제 예외
 * - throws : 예외 전가
 * - try{}catch(){} : 예외처리
 * 
 * 예외전가
 * -예외가 발생했을 경우, 직접 처리를 하는 것이 아니라,
 * - 다른곳(자신을 호출한 곳) 으로 떠넘기는 방식
 * -> 메소드명 뒤 본문을 정의하기 전에 작성
 * 
 * 예외처리	( try ~ catch ~ finally )
 * - 예외가 발생을 하면 catch절에서 처리를 하고,
 * - 예외발생이 없으면 try절만 실행
 * - finally절은 try절이 끝나면 멀티스레드로 바로 실행
 * - finally절은 사용 안해도 됨
 * 
 * 강제예외
 * -예외를 강제로 발생 시켜야 할때 생성
 * 
 * 예외클래스 만드는 순서
 * Exception 클래스를 상속받음
 * public string getMessage()를 오버라이드 함
 * getMessage()안에 예외의 이유를 반환해줌 
 * 
 */

import java.util.Scanner;

class SubException extends Exception{
	public SubException(String msg) {
		super(msg);
	}
	public String getMessage() {
		return super.getMessage() + "점수는 0~100점만 입력해 주세요!!";
		
	}
}

public class ExceptionEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("국어 점수를 입력 : ");
			int kor = sc.nextInt();
			if ( kor < 0 || kor > 100)	throw new SubException("국어");
			
		}catch (SubException e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
   
   