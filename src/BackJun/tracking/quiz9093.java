package BackJun.tracking;
// ������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.

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
