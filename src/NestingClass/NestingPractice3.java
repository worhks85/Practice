package NestingClass;

import NestingClass.Outerr1.Inner1;

class Outer2{
	private int a;
	private static int b;
	static {
		b = 20 ;
	}
	Outer2(){
		a = 10;
		
	}
	
	public void disp() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
	}
	
	static class Inner2{
		private int c;
		Inner2(){
			c=30;
		}
		public void disp2() {
			//System.out.println("a = " +a);
			System.out.println("b = " +b);
			System.out.println("c =" + c);
		}
		class Inner1_Inner1{
			
		}
	}
}
public class NestingPractice3 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		Outer2.Inner2  oi = new Outer2.Inner2();
		oi.disp2();
		
		
		
		
	}

}
