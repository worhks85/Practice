package ForWhileEx;
import java.util.Scanner;
/*
 *  수를 입력받아 그 수까지의 합을 구하는 프로그램
 */


public class WhileQuiz1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("수를 입력해주세요 : ");
		int num = scn.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum += num;
			--num;
			
		}
		System.out.println(sum);
		
		

	}

}
