package BackJun.stack;
// 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오.
// 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

import java.util.*;
import java.io.*;

public class quiz9093 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		Stack<Character> stack = new Stack<Character>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(num-- > 0) {
			String input = bf.readLine()+"\n";
			for(char ch : input.toCharArray()) {
				if(ch == ' ' || ch == '\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				} else
					stack.push(ch);
			}
		}
		bw.flush();
		return;
	}
}