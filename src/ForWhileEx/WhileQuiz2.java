package ForWhileEx;

import java.util.Scanner;

//국어 점수를 입력 받아 값이 0~100 사이 값이 아니라면 계속해서 입력 받는 프로그램

public class WhileQuiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력해주세요 : ");
		int i = sc.nextInt();
		while (i < 0 || i > 100) {
			System.out.print("국어 점수를 다시 입력해주세요 : ");
			i = sc.nextInt();
			
		}
		System.out.printf("입력하신 국어점수는 %d 입니다.",i);
	}

}
