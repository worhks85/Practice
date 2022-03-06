package EulerProject;

import java.util.spi.AbstractResourceBundleProvider;

/*
1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.

그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
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


