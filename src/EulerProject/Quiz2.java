package EulerProject;

/*
�Ǻ���ġ(Fibonacci) ������ �� ���� �ٷ� ���� �� �� ���� ���� ���Դϴ�. 
1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
4�鸸 ������ ¦�� ���� ���� ��� �Ǻ���ġ ���� ���ϸ� �󸶰� �˴ϱ�?
 */

public class Quiz2 {

	public static void main(String[] args) {
		int sum = 0;
		int i1 = 0;
		int i2 = 1;
		int i3 = 0;
		while (i3 < 4000000) {
			i3 = i2 + i1;
			if (i3%2 ==0) sum += i3;
			i1 = i2;
			i2 = i3;  		
				
		}
		System.out.println(sum);

	}

}
