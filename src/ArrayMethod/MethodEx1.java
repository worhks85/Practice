package ArrayMethod;

import java.util.Scanner;


/*	�ʿ��Ҷ�	�ʿ��Ҷ�	�ʼ�		�ʼ�	   �ʼ�
 * ���������� ��������� ��ȯ�� �޼ҵ�� (�Ű�����)
 * 								��������{....}
 * 
 * 
 * ���������� 
 * private (�ڽ��� Ŭ���������� ���ǵ��� ����)
 * default (������ ���������� ���ǵ��� ����)
 * protected (������ ���� + ��ӹ��� Ŭ������ ����)
 * public (��ü�� ����� ���̸� ��𿡼��� ���)
 * 
 * 
 * ��ȯ��
 * �⺻�ڷ��� 	int double
 * �����ڷ���	class�� ��üȭ
 * void - ��ȯ���� ���� �� ���
 * 
 * �Ű�����
 * �޼ҵ� ���� �ʿ��� ���� ���� �� �ִ� ��
 * 
 * ��������
 * ���Ͱ� �߻��Ͽ� ������ ��Ű���� �� ��
 * 
 * �޼ҵ� ȣ��� ��ǲ(�Ű�����)�� 0~ �������� �����ϰ�
 * 			  �ƿ�ǲ�� ������ 1���̴�.
 * 
 * 
 * main �޼ҵ� ����		�Ű�����,�޼ҵ忡 �ǳ����� ������	����ó��
 * public static void main(String[] args) throws IOException{}
 * �������������������	�޼ҵ� �̸�
 * 			�޼ҵ� ���� ������� ��ȯ �ڷ���
 */
public class MethodEx1 {

	public static void main(String[] args) {
		int a  = input();
		int b = input();
		int sum = plus( a , b);
		output(sum);
		

	}
	public static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է� : ");
		int su = sc.nextInt();
		return su;
	}
	
	public static int plus (int su1 ,int su2 ) {
		return su1 + su2;
	}
	
	public static void output(int sum) {
		System.out.println("�Է��Ͻ� ���� �� : "+ sum );
	}
}

	






















