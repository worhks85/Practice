package Extend;
/*
 * 인터페이스란?
 * - 추상클래스의 일종
 * - 실제 구현된 것이 전혀 없는 클래스
 * - 따라서 추상 메소드와 상수만 가질 수 있음
 * - 인스턴스 생성불가
 * - 미리 정해진 규칙을 정해 구현하도록 하는데 사용
 * - 다중상속이 가능하며, 키워드는 implements
 * 
 * 인터페이스 작성
 * - class 대신 interface를 씀 - 변수는 대문자로만 가능 -> 상수로 되기때문
 * - 멤버변수는 public static final 이어야 하며 생략 가능
 * - 멤버 메소드는 public abstract 이어야 하며, 생략가능
 * - 중첩 클래스는 static 이어야 하며 생략가능
 * 
 * class A{}
 * interface B{}
 * 
 * 클래스는 클래스를 상속받을 수 있다.
 * class C extends A{}
 * 
 * 클래스는 인터페이스를 상속 받을 수 있다.
 * class D implements B{}
 * 
 * 클래스는 클래스를 상속받고, 인터페이스를 상속 받을 수 있다.
 * class E extends A implements B{}
 * 
 * 인터페이스는 인터페이스를 상속 받을 수 있다.
 * interface F extends B{}
 * 
 * 인터페이스는 인터페이스를 다중 상속 받을 수 있다.
 * interface G extends B,F{}
 * 
 * 클래스는 클래스를 상속 받고, 인터페이스를 다중 상속 받을 수 있다.
 * class I extends A implements B,F,G{}
 * 
 * 인터페이스는 클래스를 상속 받을수 없다.
 * interface J extends A (X)
 * 
 * 장점
 * - 개발시간 단축
 * - 표준화 가능
 * - 서로 관계가 없는 클래스들에게 관계를 맺어줌
 * - 독립적인 프로그램이 가능함(영향력을 감소)
 */
public class interfaceEx1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
