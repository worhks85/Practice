package BackJun.tracking;
// 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오.
// 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

import java.util.*;

public class quiz9093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		
		while(su -- > 0 ) {
			String input = sc.nextLine() + " ";
			for ( int a = 0 ; a < input.length() ; a++) {
				if(input.charAt(a) == ' ') {
					while (!stack.isEmpty()) {
						System.out.print(stack.pop());
						
					}
					System.out.print(" ");
					
				}else 
					stack.push(input.charAt(a));
					

			}
			System.out.println();
		}
		sc.close();
		return;
	}

}
