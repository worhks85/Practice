package BackJun.ForWhile;

import java.util.Scanner;

/*
 * 
0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, 

�� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.

26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.

���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.

N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Quiz1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int origin = sc.nextInt();
		if (origin < 10 ) origin *= 10;  
		int res = origin;
		int cnt = 1;
		while(true) {
			int su1 = res/10;
			int su2 = res%10;
			int su3 = su1 + su2;
			res = su2 *10 + su3%10;
			if (origin == res) break;
			cnt++;
			
		}
		System.out.println(cnt);
		
		
	}

}
