package NestingClass;
class Outer4{
	public void aaa() {
		System.out.println("aaa�޼ҵ�");
		
	}
	public void bbb() {
		System.out.println("bbb�޼ҵ�");
		
	}
}
public class NestingPractice5 {
	public static void main(String[] args) {
		Outer4 ot = new Outer4();
		ot.bbb();
		
		
	}
}
