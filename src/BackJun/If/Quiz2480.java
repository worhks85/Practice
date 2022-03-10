package BackJun.If;

import java.util.Scanner;

public class Quiz2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int sum = 0;
		if (i1 == i2&& i2 == i3 ) sum = 10000+i1*1000;
		else if ( i1 == i2 ) sum = 1000+i1*100;
		else if ( i3 == i2 ) sum = 1000+i2*100;
		else if ( i1 == i3 ) sum = 1000+i1*100;
		else sum = Math.max(Math.max(i1, i2),i3)*100;
		System.out.println(sum);
		

	}

}
