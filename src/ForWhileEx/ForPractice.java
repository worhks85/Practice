package ForWhileEx;
import java.io.*;


/*
 * 
 * ���� ����
 * for ( �ݺ����� �ʱ�ȭ ; �ݺ����� ���ǰ˻� ; �ݺ������� ����ȭ)
 * {		1				2,5,8				4,7
 * 	���๮	3,6
 * }
 * 
 * 
 * for (�ʱ�� ; ���ǽ� ; ������)
 * 
 */
public class ForPractice {

	public static void main(String[] args) throws IOException {

//		System.out.print( " �� ���� �Է� : ");
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
