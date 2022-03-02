package IfEx;

import java.util.Scanner;

/*
 * 한개의 수를 입력 받아 입력 받은 수가 짝수인자 홀수인지 알려주는 프로그램
 */
public class quiz1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("수를 입력 하세요 : ");
		int a = scn.nextInt();
		if (a % 2 == 1 ) System.out.println("홀수입니다.");
		else System.out.println("짝수입니다.");
		
	
	}

}


/*
 * 
*/
