package ForWhileEx;
import java.io.*;


/*
 * 
 * 실행 순서
 * for ( 반복변수 초기화 ; 반복변수 조건검사 ; 반복변수의 값변화)
 * {		1				2,5,8				4,7
 * 	실행문	3,6
 * }
 * 
 * 
 * for (초기식 ; 조건식 ; 증감식)
 * 
 */
public class ForPractice {

	public static void main(String[] args) throws IOException {

//		System.out.print( " 단 수를 입력 : ");
//		int num = System.in.read() - 48 ;
//		
//		for (int i = 1 ; i < 9; ++i) {
//			System.out.println(num  + "*" +i+ "=" + num*i);
		
//		}
		
		for (int i = 1 ; i <6 ; i++) {
			for ( int j =1 ; j <=i ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 1 ; i <6 ; i++) {
			for ( int j =5 ; j >=i ; j--) System.out.print('*');
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 1 ; i <6 ; i++) {
			for (int a = 4; a >= i ; a--) System.out.print(" ");
			for (int b = 1; b <=i ; b++) System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 1 ; i <6 ; i++) {
			for (int a = 2; a <= i ; a++) System.out.print(" ");
			for (int b = 5; b >=i ; b--) System.out.print("*");
			System.out.println();
		}
	
		
	}

}
