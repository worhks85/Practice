package Extend;


class pro{
	public void attack() {
		System.out.println("�����佺�� ����");
	}
	public void depense() {
		System.out.println("�����佺�� ���");
	}
}

class zealot extends pro{
	public void attack() {
		System.out.println("������ ����");
	}
	public void depense() {
		System.out.println("������ ���");
	}
}

class dragon extends pro{
	public void attack() {
		System.out.println("����� ����");
		
	}
	public void depense() {
		System.out.println("����� ���");
	}
}
public class ExtendQuiz2 {

	public static void main(String[] args) {
		pro unit1 = new zealot();
		pro unit2 = new dragon();
		unit1.attack();
		unit2.attack();
		
		unit1.depense();
		unit2.depense();
		
	}

}
