package NestingClass;

class Outerr1{
	private int a;
	private static int b;
	static {
		b = 20 ;
	}
	Outerr1(){
		a = 10;
		
	}
	
	public void disp() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
	}
	
	class Inner1{
		private int c;
		Inner1(){
			c=30;
		}
		public void disp2() {
			System.out.println("a = " +a);
			System.out.println("b = " +b);
			System.out.println("c =" + c);
		}
		class Inner1_Inner1{
			
		}
	}
}
public class NestingPractice2 {

	public static void main(String[] args) {
		Outerr1 ot = new Outerr1();
		Outerr1.Inner1 oi = ot.new Inner1();
		oi.disp2();
		
		
		
		
		
	}

}
