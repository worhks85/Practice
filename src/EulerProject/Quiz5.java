package EulerProject;

import java.util.spi.AbstractResourceBundleProvider;

/*
1 ~ 10 ������ � ���ε� ������ �������� ���� ���� ���� 2520�Դϴ�.

�׷��� 1 ~ 20 ������ � ���ε� ������ �������� ���� ���� ���� ���Դϱ�?
 */
public class Quiz5 {

	public static void main(String[] args) {
		int min = 2;
		int max = 0;
		for (int i = 3 ; i <21 ; i ++) {
			int rest = i % min;
			if( rest != 0) {
				max = min*i/rest;
			}
			System.out.println(min);
			
		}
		
		
		
	}

}


