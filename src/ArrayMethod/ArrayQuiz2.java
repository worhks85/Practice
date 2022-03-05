package ArrayMethod;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class ArrayQuiz2 {
	public static void main(String args[]) {
		//인원수를 입력 받고, 그 인원수 만큼 이름과
		//전화번호를 입력 받아 출력해주세요
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력해 주세여 :");
		int su = sc.nextInt();
		
		
		String arr[] = new String[su];
		String tel[] = new String[su];
		for (int i = 0 ;i < su ; i ++) {
			System.out.print("이름을 입력 : ");
			arr[i] = sc.next();
			System.out.print("번호를 입력 : ");
			tel[i] = sc.next();
		}
		System.out.printf("이름\t 번호\n");
		for (int i = 0 ; i < su ; i ++) {
			System.out.printf("%s\t %s\n",arr[i],tel[i]);
		}
		
		
	}
}
