package Extend;


class pro{
	public void attack() {
		System.out.println("프로토스가 공격");
	}
	public void depense() {
		System.out.println("프로토스가 방어");
	}
}

class zealot extends pro{
	public void attack() {
		System.out.println("질럿이 공격");
	}
	public void depense() {
		System.out.println("질럿이 방어");
	}
}

class dragon extends pro{
	public void attack() {
		System.out.println("드라군이 공격");
		
	}
	public void depense() {
		System.out.println("드라군이 방어");
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
