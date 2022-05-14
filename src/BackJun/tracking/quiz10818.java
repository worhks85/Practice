package BackJun.tracking;

import java.util.Scanner;

public class quiz10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leng = sc.nextInt();
		int[]  su = new int[leng];

		for (int i =0; i <su.length ; i++) {
			su[i] =sc.nextInt();
		}
		
		int max = su[0];
		int min = su[0];
		for (int i =1; i <leng ; i++) {
			if( max < su[i]) max = su[i];
			if( min > su[i]) min = su[i];
		}
		System.out.println(min + " " + max);
		
		
		
		
	}

}
