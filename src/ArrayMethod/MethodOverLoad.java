/*
 * �޼ҵ� �����ε�
 *  - �޼ҵ��� �̸��� ���� �Ű������� �ٸ���
 *  - �Ű������� Ʋ���ٴ� ����, �ڷ����� �ٸ��ų�
 *  �Ű������� ������ �ٸ��ų� �ڷ��� ������ �ٸ����� �ǹ�
 *  - ��ȯ���� �ٸ��� ����
 * 
 * �޼ҵ� ���ȣ��
 * - �޼ҵ� ������ �ڽ��� �� ȣ�� �� ��
 * ������ ���� �ݵ�� ���� ������ �־�� ��
 */


package ArrayMethod;

import java.util.Scanner;


public class MethodOverLoad {
	public static void main (String args[]) {
		//���丮�� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���丮���� ���� �Է����ּ��� : ");
		int fac = sc.nextInt();
		System.out.printf("%d �� ���丮�� ������� %d �Դϴ�.\n",fac,factorial(fac));
	}
	
	public static int factorial(int n) {
		if(n==1) return 1;
		
		return n *factorial(n-1);
		
	}
}
