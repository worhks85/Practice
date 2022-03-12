package NestingClass;
class Outer4{
	public void aaa() {
		System.out.println("aaa메소드");
		
	}
	public void bbb() {
		System.out.println("bbb메소드");
		
	}
}
public class NestingPractice5 {
	public static void main(String[] args) {
		Outer4 ot = new Outer4();
		ot.bbb();
		
		
	}
}
