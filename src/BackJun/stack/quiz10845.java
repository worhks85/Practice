package BackJun.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class quiz10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int su = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		while (su-- > 0 ) {
			String command = br.readLine();
			char a = command.charAt(0);
			for(int ss : st) bw.write(ss);
			switch (a) {
			case 'p':
				if(command.charAt(1) == 'u') {
					st.push(Character.getNumericValue(command.charAt(5)));
				}else {
					if(!st.isEmpty()) {
						bw.write(st.get(0));
						st.remove(0);}
					else bw.write(-1);
				}
				break;
			case 's': bw.write(st.size());
				break;
			case 'e': 
				if(st.isEmpty())bw.write(1);
				else  bw.write(0);
				break;
			case 'f':
				if(!st.isEmpty())bw.write(st.get(0));
				else bw.write(-1);
				break;
			case 'b':
				if(!st.isEmpty())bw.write(st.get(st.size()-1));
				else bw.write(-1);
				break;
		
			}
			for(int ss : st) bw.write(ss);
			
			
		}
		
		
		
	}
}
