package BackJun.ForWhile;

import java.util.Scanner;

/*
 * ����
N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.

���
������İ� ���� N*1���� N*9���� ����Ѵ�.
 */
import java.util.Scanner;
public class Quiz2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		for ( int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d * %d = %d\n",su,i ,su * i);
		}
		
		
			
	}

}
