package EulerProject;

import IfEx.IfEx1;

/*
앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.

두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.

세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
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
