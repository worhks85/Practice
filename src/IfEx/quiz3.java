package IfEx;
// ���� ������ 3���� �Է¹޾� ��հ��� 60 �̻��̸� �հ�
// 60�� �̸��̸� ���հ��� �˷��ִ� ���α׷�

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է��� �ּ��� : ");
		int num1 = scn.nextInt();
		System.out.print("�� ��° ���� �Է��� �ּ��� : ");
		int num2 = scn.nextInt();
		System.out.print("�� ��° ���� �Է��� �ּ��� : ");
		int num3 = scn.nextInt();
		
		int sum = num1 + num2 +num3;
		if (sum/3 >= 60 )System.out.println("�հ� �Դϴ�. ");
		else System.out.println("���հ� �Դϴ�.");

	}

}
