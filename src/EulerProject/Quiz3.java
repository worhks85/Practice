package EulerProject;
/*
� ���� �Ҽ��� �����θ� ��Ÿ���� ���� ���μ����ض� �ϰ�, �� �Ҽ����� �� ���� ���μ���� �մϴ�.
���� ��� 13195�� ���μ��� 5, 7, 13, 29 �Դϴ�.

600851475143�� ���μ� �߿��� ���� ū ���� ���ϼ���.
*/
public class Quiz3 {

	public static void main(String[] args) {
		long ll = 600851475143L;
		for ( int i = 2 ; i < ll ; i++) {
			if (ll % i == 0) { 
				ll = ll/i;
		}
		}
		System.out.println(ll);
	}

}
