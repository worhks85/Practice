package IfEx;

import java.util.Scanner;

/* ���������� �Է¹޾� 90�� �̻��̸� A , 80-89�� �̸� B
70-79�� �̸� C, 60-69 ���̸� D, 60 �� �̸��̸� F �� �˷��ִ� ���α׷�

*/
public class Quiz5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int num = scn.nextInt();
		
		if (num>=90) System.out.println("A �Դϴ�.");
		else if (num >= 80) System.out.println("B �Դϴ�.");
		else if (num >= 70) System.out.println("C �Դϴ�.");
		else if (num >= 60) System.out.println("D �Դϴ�.");
		else System.out.println("F �Դϴ�.");

}
}
