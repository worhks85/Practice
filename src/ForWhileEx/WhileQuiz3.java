package ForWhileEx;

import java.util.Scanner;

// ������ ���� �Է� �޾� �� �հ� ����� ���ϴ� ���α׷�
// ( ��, ������ 0 �� �Է��ϸ� �Է��� ����
public class WhileQuiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int i = 0;
		int sum = 0 ;
		
		
		while (num > 0) {
			i++;
			System.out.print("���� �Է��� �ּ��� : ");
			num = sc.nextInt();
			sum += num;
			float avg = (float)sum/i;
			System.out.printf("�� ���� %d �̰� ��� ���� %.2f �Դϴ�.\n",sum,avg);
			
		}
	}

}
