package Class;

class Bank{
	private String name;
	private double money;
	private static float iyul;
	static {
		iyul = 0.02f;
	}
	public Bank(String name, double money, float iyul) {
		this.name = name;
		this.money = money;
		Bank.iyul = iyul;
		
	}
	public void setIyul(float iyul) {
		Bank.iyul =iyul;
		
	}
	public void disp() {
		System.out.println(name + "���� �ܾ��� "+ money +"�� �̰�"
				+ ", ���� ���� �Ǵ� ������ "+ Bank.iyul *100+"% �Դϴ�." );
	}
	
	
}
public class ClassEx3 {

	public static void main(String[] args) {
		Bank aaa = new Bank("aaa", 1000, 0.02f);
		System.out.println("=====================");
		aaa.disp();
		Bank bbb = new Bank("bbb", 1000, 0.01f);
//		aaa.setIyul(0.01f);		static ������ ��ü�� �ٲ�
		aaa.disp();
		bbb.disp();
		Bank ccc = new Bank("ccc", 1000, 0.03f);
//		aaa.setIyul(0.03f);
//		bbb.setIyul(0.03f);
		aaa.disp();
		bbb.disp();
		ccc.disp();
		
		
		
	}

}
