package IfEx;
// 국어 점수를 3개를 입력받아 평균값이 60 이상이면 합격
// 60점 미만이면 불합격을 알려주는 프로그램

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력해 주세요 : ");
		int num1 = scn.nextInt();
		System.out.print("두 번째 수를 입력해 주세요 : ");
		int num2 = scn.nextInt();
		System.out.print("세 번째 수를 입력해 주세요 : ");
		int num3 = scn.nextInt();
		
		int sum = num1 + num2 +num3;
		if (sum/3 >= 60 )System.out.println("합격 입니다. ");
		else System.out.println("불합격 입니다.");

	}

}
