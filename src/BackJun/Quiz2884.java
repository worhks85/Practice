package BackJun;

import java.util.Scanner;

public class Quiz2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt() - 45;
		if ( min < 0) {
			min += 60;
			hour -= 1;
		}
		if (hour < 0) {
			hour +=24;
		}
		System.out.println(hour + " " + min);
	}

}
