package ArrayMethod;

import java.util.Scanner;

// Math.random()
// Random 클래스
//1 ~ 10 사이의 정수값 뽑기

public class RandomEx1 {

	public static void main(String[] args) {
		int comsu = (int)(Math.random()*100) +1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1 부터 100 사이의 수를 입력 :");
			int sel = sc.nextInt();
			cnt++;
			if (sel == comsu) break ;
			
			if (sel > comsu) System.out.println("down");
			else System.out.println("up");
		}
		System.out.println(cnt +" 번 만에 맞추셧습니다");
		
		
	}

}
