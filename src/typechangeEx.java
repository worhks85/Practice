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
 * "3.4" -->3.4
 * Double.parseDouble("3.4")
 * 
 * ���ڿ��� ���ڷ� ��ȯ
 * "3" --> '3'
 * charAt('3')
 * 
 * ���ڸ� ���ڷ� ��ȯ
 * '3' - '0' = 3
 * 
 * 
 */




public class typechangeEx {

	public static void main(String[] args) {
		String str ="3";
		
		System.out.println(str.charAt(0));
		System.out.println('3' -'0' +1);
		System.out.println(Integer.parseInt(str) +1 );
		System.out.println("3" + 1 ); // 1�� "1" �� �ٲ�
		System.out.println( 3 + '0');
		
		
		
	}

}
