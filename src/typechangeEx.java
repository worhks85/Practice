/*
 * ���ڿ��� ��ȯ
 * - 3 + "" = "3"
 * - '3' + "" = "3"
 * 
 * 
 * ���ڿ��� ���ڷ� ��ȯ
 * "3" --> 3
 * Integer.parseInt("3")
 * 
 * 
 * ���ڿ��� ����� ��ȯ
 * "3.4" --> 3.4
 * Double.parseDouble("3.4")
 * 
 * ���ڿ��� ���ڷ� ��ȯ
 * "3" --> '3'
 * charAt('3')
 * 
 * ���ڸ� ���ڷ� ��ȯ
 * '3' - '0' = 3
 * 
 * "" + 7 + 7 = "77"
 * 7+7+"" = 14 + "" = "14"
 * ���ڿ� + any type = ���ڿ�
 * ���� -> ���ڿ�	
 * 
 * ���ڿ� -> ����
 * Integer.parseInt(Int)
 * 
 * 
 * �⺻�� - (boolean, char , byte , short , int , long , float , double)
 * ���� ���� ����
 * 
 * ���� - true �� false �� �ϳ��� ������ ������ ���ǽİ� ���� ��꿡 ���ȴ�.
 * ������ - ���ڸ� �����ϴµ� ��� , �ϳ��� ���ڸ��� ���� �� �� �ִ�.
 * ������ - ���� ���� �����ϴµ� �翵 , �ַ� ����ϴ°��� int �̸� long�̸�,
 * 		   byte�� ���� �����͸� �ٸ��� ���
 * 			short�� c������ ȣ���� ���� �߰�
 * �Ǽ��� - �Ǽ����� �����ϴµ� ��� float �� double�� �ִ�.����
 * 
 * ������ - (�⺻���� ������ ������)
 * �޸� �ּ� ���� (4byte or 8byte)
 */


public class typechangeEx {

	public static void main(String[] args) {
		/*		byte a = 10;		//1byte = -128 ~ 127
		short b = 10000;	//2byte = -2^15 ~ 2^15-1
		int c = 420000;		//4byte = -2^31 ~ 2^31-1 �� 20��
		long d = 2000000L;	//8byte = -2^62 ~ 2^62-1
		char e = 'a';		//2byte = 0~2^16-1
		float f = 10.23f;	//4byte
		double g = 10.23;	//8byte	�Ǽ����� �⺻ �ڷ���
		boolean h = true;	//true or false
		String i = "study";	//���ڿ� �ڷ���
*/		
		
		byte a = 10;
		char b = (char)a;
		short c = (short)b;
		char d = (char)c;
		String str ="3";
		
		System.out.println(str.charAt(0));
		System.out.println('3' -'0' +1);
		System.out.println(Integer.parseInt(str) +1 );
		System.out.println("3" + 1 ); // 1�� "1" �� �ٲ�
		System.out.println( 3 + '0');
		
		
		
	}

}
