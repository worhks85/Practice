package ForWhileEx;

import java.util.Scanner;

//���� ������ �Է� �޾� ���� 0~100 ���� ���� �ƴ϶�� ����ؼ� �Է� �޴� ���α׷�

public class WhileQuiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է����ּ��� : ");
		int i = sc.nextInt();
		while (i < 0 || i > 100) {
			System.out.print("���� ������ �ٽ� �Է����ּ��� : ");
			i = sc.nextInt();
			
		}
		System.out.printf("�Է��Ͻ� ���������� %d �Դϴ�.",i);
	}

}
