package ArrayMethod;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class ArrayQuiz2 {
	public static void main(String args[]) {
		//�ο����� �Է� �ް�, �� �ο��� ��ŭ �̸���
		//��ȭ��ȣ�� �Է� �޾� ������ּ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο����� �Է��� �ּ��� :");
		int su = sc.nextInt();
		
		
		String arr[] = new String[su];
		String tel[] = new String[su];
		for (int i = 0 ;i < su ; i ++) {
			System.out.print("�̸��� �Է� : ");
			arr[i] = sc.next();
			System.out.print("��ȣ�� �Է� : ");
			tel[i] = sc.next();
		}
		System.out.printf("�̸�\t ��ȣ\n");
		for (int i = 0 ; i < su ; i ++) {
			System.out.printf("%s\t %s\n",arr[i],tel[i]);
		}
		
		
	}
}
