package ArrayMethod;

import java.util.Scanner;

// Math.random()
// Random Ŭ����
//1 ~ 10 ������ ������ �̱�

public class RandomEx1 {

	public static void main(String[] args) {
		int comsu = (int)(Math.random()*100) +1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1 ���� 100 ������ ���� �Է� :");
			int sel = sc.nextInt();
			cnt++;
			if (sel == comsu) break ;
			
			if (sel > comsu) System.out.println("down");
			else System.out.println("up");
		}
		System.out.println(cnt +" �� ���� ���߼˽��ϴ�");
		
		
	}

}
