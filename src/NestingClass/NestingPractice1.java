package NestingClass;
/*
 * 중첩클래스
 * - 하나의 클래스 내부에 또 다른 클래스를 사용하는것
 * - 일반 정적 지역 익명
 * 
 *  
 * 일반 중첩 클래스
 * - 일반 멤버 필드와 접근 방법이 동일
 * - 외부 클래스의 객체가 반드시 필요
 * - 내부에서 클래스의 사용이 빈번할 때 사용
 * 
 * 정적 중첩 클래스
 * - static 메소드와 접근 방법이 동일
 * - 외부 클래스의 객체가 필요하지않음
 * - 인터페이스의 멤버로 사용이 가능함
 * 
 *  
 * 
 * 
 */



class Outer1{
	private int a ;
	private static int b;
	static { b= 20;}
	public Outer1() { a = 10 ;}
	public void disp() {
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	class Inner1{
		private int c ;
		public Inner1() { c=100;}
		public void disp2() {
			disp();
			System.out.println("c = " + c);
		}
	}
}
	public class NestingPractice1 {

	public static void main(String[] args) {
		Outer1 ot = new Outer1();
		ot.disp();
		Outer1.Inner1 oi = ot.new Inner1();
		
	}

}
