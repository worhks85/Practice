package IfEx;

import java.util.Scanner;

/*
 * ������ ���� �Է� �޾� ū ����� �����ϱ�
 */
public class Quiz2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
		int a = scn.nextInt();
		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		int b = scn.nextInt();
		System.out.print("����° ���ڸ� �Է����ּ��� : ");
		int c = scn.nextInt();
		
		if (a > b) { //a>b
			if (b > c) System.out.printf("%d %d %d",a,b,c);
			else if ( a > c)  System.out.printf("%d %d %d",a,c,b);
			else System.out.printf("%d %d %d",c,a,b);
		}
		
//		b > a 
		else {
			if(a > c) System.out.printf("%d %d %d",b,a,c);
			else if ( b > c ) System.out.printf("%d %d %d",b,c,a);
			else System.out.printf("%d %d %d",c,b,a);
		
		
		}
	}

}

/*
 * if( b > a && b > c ){
 * int tmp = a
 * a = b
 * b =tmp
 * }else if (c > b && c > a){
 * int tmp = a
 * a = c
 * c = tmp
 * }
 * 
 * if (c > b) {
 * tmp = b
 * b = c
 * c = tmp
 * 
 * sysout a, b ,c
 * 
 */



















