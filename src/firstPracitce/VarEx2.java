package firstPracitce;
// byte , short , int ,long = ������ 1	Long ���̻� L
// char = ������ '��'			
// float , double = �Ǽ��� 3.14		���̻� f,d
// boolean = ���� = boolean
// ���� = �ϳ��� ���� �����ϱ� ���� ����
// ��� = �� ���� ���� ���� ������ ����
// ���ͷ� = �� ��ü�� ���� �ǹ��ϴ� �� ���̻�� ���¸� ���������

// final int MAX =100; ����� ����� ���ؼ� �ڿ� final�� �Է�


public class VarEx2 {

	public static void main(String[] args) {
		int i = 100;
		int oct = 010 ;//8����;
		int hex = 0x100 ;//16����;
		long l = 10_000_000_000L; 	//100�� int�� �ִ�� �� 20��
		float f = 3.14f ;
		double d = 3.14f ;	//double �� d�� ���� ����
		final int score= 100;
		
		System.out.println(score);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(f);
		System.out.println(d);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}

}
