package EulerProject;

/*
 * 10���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� 3, 5, 6, 9 �̰�, �̰��� ��� ���ϸ� 23�Դϴ�.
 * 1000���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?
 */

public class Quiz1 {

	public static void main(String[] args) {
		int sum = 0;
		for ( int i = 0 ; i < 1000 ; i++) {
			if (i % 3 ==0|| i % 5==0) {
				sum += i;
				
			}
		}
		System.out.println(sum);
	}

}
