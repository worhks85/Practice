package EulerProject;

import IfEx.IfEx1;

/*
�տ������� ���� ���� �ڿ������� ���� ���� ����� ���� ���� ��Ī��(palindrome)��� �θ��ϴ�.

�� �ڸ� ���� ���� ���� �� �ִ� ��Ī�� �� ���� ū ���� 9009 (= 91 �� 99) �Դϴ�.

�� �ڸ� ���� ���� ���� �� �ִ� ���� ū ��Ī���� ���Դϱ�?
*/


public class Quiz4 {
	public static void main (String args[]) {
		int large = 0 ;
		int gob = 0;
		String gobst = "";
		
		for (int i = 999 ; i > 100 ; i --) {
			for (int b = 999 ; b >100 ; b--) {
				gob = i*b;
				gobst = gob + "";
				if  (gobst.charAt(0) == gobst.charAt(gobst.length()-1)
						&&gobst.charAt(1) == gobst.charAt(gobst.length()-2)
						&&gobst.charAt(2) == gobst.charAt(gobst.length()-3)
						&& gob > large) {
					large = gob; 
				}
				
			}
		}

		System.out.println(large);
		
		
	}

}
