package BackJun.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class quiz1406_2 {
	public static void main(String[] args) throws IOException {

		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int length = Integer.parseInt(br.readLine());
		
		for (int i =0 ; i <str.length() ; i++) {
			char a = str.charAt(i);
			stack1.push(a);
		}

		while (length-- > 0) {
			String command = br.readLine();
			char c = command.charAt(0);
			switch (c) {
			case 'L': 
				if(!stack1.isEmpty()) stack2.push(stack1.pop());
				break;
			case 'D':
				if(!stack2.isEmpty()) stack1.push(stack2.pop());
				break;
			case 'B': 
				if(!stack1.isEmpty()) stack1.pop();
				break;
			case 'P': 
				char a = command.charAt(2);
				stack1.push(a);
				break;
			}
		}
		int size =stack2.size();
		for (int i =0 ; i < size ;i++) {
			stack1.push(stack2.peek());  
			stack2.pop();
		}
		for( char ch : stack1) {
			bw.write(ch);
		}
		bw.flush();
		bw.close();


	}
}
