package NestingClass;
/*
 * ��øŬ����
 * - �ϳ��� Ŭ���� ���ο� �� �ٸ� Ŭ������ ����ϴ°�
 * - �Ϲ� ���� ���� �͸�
 * 
 *  
 * �Ϲ� ��ø Ŭ����
 * - �Ϲ� ��� �ʵ�� ���� ����� ����
 * - �ܺ� Ŭ������ ��ü�� �ݵ�� �ʿ�
 * - ���ο��� Ŭ������ ����� ����� �� ���
 * 
 * ���� ��ø Ŭ����
 * - static �޼ҵ�� ���� ����� ����
 * - �ܺ� Ŭ������ ��ü�� �ʿ���������
 * - �������̽��� ����� ����� ������
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
