package ArrayMethod;

import java.util.Scanner;

import javax.naming.NameParser;

public class ArrayQuiz3 {

	public static void main(String[] args) {
		// 인원을 설정하고 이름 국어 영어 수학점수를 입력받아 총전과 순위까지 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print(" 인원수를 입력해 주세요 : ");
		int inwon = sc.nextInt();
		
		String name[] = new String[inwon];
		int kor[] = new int[inwon];
		int eng[] = new int[inwon];
		int math[] = new int[inwon];
		int sum[] = new int[inwon];
		int rank[] = new int [inwon];
		int rank2[] = new int [inwon];
		for ( int i = 0 ; i < name.length ; i++) {
			System.out.print("이름을 입력해 주세요 :");
			name [i] = sc.next();
			System.out.print("국어 점수를 입력해 주세요 :");
			kor [i] = sc.nextInt();
			System.out.print("영어 점수를 입력해 주세요 :");
			eng [i] = sc.nextInt();
			System.out.print("수학 점수를 입력해 주세요 :");
			math[i] = sc.nextInt();
			sum [i] = kor[i] + eng[i] + math[i];
			rank[i] =sum[i];
		}
		
		/*
		 
		for (int i = 0 ; i <name.length-1; i++) {
			for (int a = i ;a < name.length; a++)
				if (rank[i] <rank[a]) {
					int tmp = rank[i];
					rank[i]= rank[a];
					rank[a]=tmp;	
				}
		}
		for (int i = 0 ; i < name.length ; i++) {
			for(int a = 0 ; a < name.length;a++) if (sum[i] == rank[a]) rank2[i] = a+1;
		}
		
		*/
		for (int i = 0 ; i < inwon ; i++) {
			for( int j = 0 ; j < inwon ; j ++) {
				if (sum[i] < sum[j]) rank[i]++;
			}
		}
		
		System.out.printf("이름\t국어\t영어\t수학\t총합\t순위\n");
		for (int i =0 ; i<name.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",name[i],kor[i],eng[i],math[i],sum[i],rank2[i]);
		}
		
		
	}

}
