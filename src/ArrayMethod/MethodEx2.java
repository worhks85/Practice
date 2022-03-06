package ArrayMethod;

import java.io.IOException;
import java.util.Scanner;

public class MethodEx2 {
	// �ΰ��� ���� �Ѱ��� ��� �����ڸ� �Է� �޾� �� ������ ��� �ϴ� ���α׷�
	//�� �����ڰ� �����϶��� ū������ �������� ���� ���
	//������ �϶��� 2��° ���� 0�̸� 1�� ���ļ� ���
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		int su1 = input();
		int su2 = input();
		int result  = 0;
		System.out.print("��� �����ڸ� �Է� : ");
		char op = (char)System.in.read();
		switch (op) {
		case '+' :
			result =  plus(su1,su2);
			break;
		case '-' :
			result =  min(su1,su2);
			break;
		case '*' :
			result =  mul(su1,su2);
			break;
		case '/' :
			result =  div(su1,su2);
			break;
		default:
			System.out.println("�����ڸ� �߸� �Է��ϼ˽��ϴ�.");
		}
		System.out.println("����� "+result +" �Դϴ�.");
		
		
		
		
	}
	public static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �� �Է� : ");
		int su = scanner.nextInt();
		return su;
	}
	
	public static int plus(int a , int b) {
		return a+b;
		
	}
	
	public static int min(int a , int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		return max-min;
		
	}
	
	public static int mul(int a , int b) {
		return a*b;
	}
	
	public static int div(int a , int b) {
		if (b == 0 ) b=1;
		return a/b;
	}
	
	

}