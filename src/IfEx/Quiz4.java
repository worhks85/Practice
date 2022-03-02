package IfEx;

import java.util.Scanner;

/*
 * 한개의 수를 입력 받아 그 수가 3의 배수인지,
 * 5의 배수인지 3과 5의 배수인지 아니면 아닌지를 알려주는 프로그램
 */

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("수를 입력해 주세요 : ");
		int num = scn.nextInt();
		
		if (num % 3 ==0) {
			if (num % 5 == 0) System.out.println("이 수는 3과 5의 배수입니다.");
			else System.out.println("이 수는 3의 배수 입니다.");
		}
		else if (num % 5 == 0) System.out.println("이 수는 5의 배수 입니다.");
		else System.out.println("이 수는 3의 배수도 5의 배수도 아닙니다.");
	}

}
