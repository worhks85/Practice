package IfEx;

import java.util.Scanner;

/* 국어점수를 입력받아 90점 이상이면 A , 80-89점 이면 B
70-79점 이면 C, 60-69 점이면 D, 60 점 미만이면 F 를 알려주는 프로그램

*/
public class Quiz5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int num = scn.nextInt();
		
		if (num>=90) System.out.println("A 입니다.");
		else if (num >= 80) System.out.println("B 입니다.");
		else if (num >= 70) System.out.println("C 입니다.");
		else if (num >= 60) System.out.println("D 입니다.");
		else System.out.println("F 입니다.");

}
}
