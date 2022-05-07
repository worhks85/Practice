package BackJun.stack;
// ������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.

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