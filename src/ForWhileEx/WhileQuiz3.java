package ForWhileEx;

import java.util.Scanner;

// 임의의 수를 입력 받아 그 합과 평균을 구하는 프로그램
// ( 단, 음수나 0 을 입력하면 입력을 종료
public class WhileQuiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int i = 0;
		int sum = 0 ;
		
		
		while (num > 0) {
			i++;
			System.out.print("수를 입력해 주세요 : ");
			num = sc.nextInt();
			sum += num;
			float avg = (float)sum/i;
			System.out.printf("총 합은 %d 이고 평균 값은 %.2f 입니다.\n",sum,avg);
			
		}
	}

}
