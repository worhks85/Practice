package IfEx;

import java.util.Scanner;

/*
 * �Ѱ��� ���� �Է� �޾� �� ���� 3�� �������,
 * 5�� ������� 3�� 5�� ������� �ƴϸ� �ƴ����� �˷��ִ� ���α׷�
 */

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("���� �Է��� �ּ��� : ");
		int num = scn.nextInt();
		
		if (num % 3 ==0) {
			if (num % 5 == 0) System.out.println("�� ���� 3�� 5�� ����Դϴ�.");
			else System.out.println("�� ���� 3�� ��� �Դϴ�.");
		}
		else if (num % 5 == 0) System.out.println("�� ���� 5�� ��� �Դϴ�.");
		else System.out.println("�� ���� 3�� ����� 5�� ����� �ƴմϴ�.");
	}

}
