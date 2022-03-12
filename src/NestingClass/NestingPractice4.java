package NestingClass;

class Outer3{
	private int a;
	private static int b;
	static {
		b = 20;
	}
	Outer3(){
		a = 10;
		
	}
	public void disp() {
		class Inner3{
			private int c;
			Inner3 (){
				c= 30;
				
			}
			public void disp_in() {
				System.out.println("a = " +a);
				System.out.println("b = " +b);
				System.out.println("c = " +c);
			}
		}
		Inner3 in = new Inner3();
		in.disp_in();
		
		
	}
	public void disp2() {
		class Inner3{
			private int c;
			Inner3 (){
				c= 30;
				
			}
			public void disp_in() {
				System.out.println("a = " +a);
				System.out.println("b = " +b);
				System.out.println("c = " +c);
			}
		}
		Inner3 in = new Inner3();
		in.disp_in();
}
}
public class NestingPractice4 {

	public static void main(String[] args) {
		Outer3 ot = new Outer3();
		ot.disp();
		
		
	}

}
