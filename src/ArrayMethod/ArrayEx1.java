package ArrayMethod;

import java.util.Scanner;

/*
 * �迭 - 	�ڷ����� ������ �������� ���� ���̾� ������ �� �ֵ��� �ϴ�	��� ������ ����ü
 * ���� - 	�迭�� ����� ������ ��
 * �ε���	- 	�迭�� ���ҿ� �����ϱ� ���� ÷��
 * 
 * 
 * �ڹ� �޸��� ����
 * 
 * 		��� �� �޼ҵ�� 	- JVM ���۽� ����
 * 						- static ���� class ��Ÿ�� ��� method ���� ����
 * 
 * JVM 			��		- �����͸� �����ϴ� ����
 * 						- ������ �÷���(GC)�� �������
 * 		
 * 			����			- �������� �ּҰ��� �����ϴ� ����
 * 	
 * 
 * ���۷��� ���� - �⺻ �����͸� ������ ���� ���� �ƴϰ� �޸𸮻��� �ٸ� ��ü�� �迭�� ����Ű�� �ִ� ����
 * EX) int[] a = new int[5];  -> a == [ 1 , 2 , 3 , 4 , 5 ]
 * ���� �ȿ� ���� �ִ� a[]�� �ּҰ��� a�� ���� 
 * ���� a[]�� �����Ͱ� ����
 * 
 * �ʱ� ���� �޸��� �����Ͽ� ������ ����ϰ� �̵��� �߰�ȣ {} �� ������
 * 
 * ex 	int [] a = {10, 20, 30, 40 ,50};
 * 		int [] a = new int[]{10, 20 ,30 ,40 ,50}
 * 
 * a.length == �迭�� ����
 * 
 * 
 * 
 * 
 */
public class ArrayEx1 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int arr [] = new int [10];
		int sum = 0 ;
		for (int i = 0 ; i < arr.length; ++i) {
			System.out.print(i + 1 + "���� ���� �Է��� �ּ��� : ");
			arr [i] = scanner.nextInt();
			sum += arr[i];
		}
		for (int i = 0 ; i<arr.length ; i++) System.out.print(arr[i] + ",");
		System.out.println();
		System.out.println( "�� ����" + sum + " �Դϴ�.");
		
		
		
		}
			
	
	
	
	}
	
