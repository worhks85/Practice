package BackJun;

import java.util.Scanner;

public class Quiz2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int plus = sc.nextInt();
		min = min + plus;
		while (min >= 60) {
			min -= 60;
			hour += 1;
		}
		if (hour >= 24) {
			hour -=24;
		}
		System.out.println(hour + " " + min);
	}

}
