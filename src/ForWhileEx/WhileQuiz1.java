package ForWhileEx;
import java.util.Scanner;
/*
 *  ���� �Է¹޾� �� �������� ���� ���ϴ� ���α׷�
 */


public class WhileQuiz1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("���� �Է����ּ��� : ");
		int num = scn.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum += num;
			--num;
			
		}
		System.out.println(sum);
		
		

	}

}
