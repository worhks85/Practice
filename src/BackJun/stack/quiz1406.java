package BackJun.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class quiz1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Character> list = new ArrayList<Character>();
		String in = br.readLine();
		int index = in.length();

		for ( int i = 0 ; i <in.length() ; i++) {
			list.add(in.charAt(i));	
		}

		int leng = Integer.parseInt(br.readLine());

		while ( leng-- >0) {
			if (index < 0 ) index = 0;
			if (index > list.size()) index = list.size();
			String command = br.readLine();
			if (command.contains("L")) {
				if (index > 0) index--;
			}
			if (command.contains("D")) {
				if( index < in.length()) index++;
			}
			if (command.contains("B")) {
				if (index > 0) list.remove(index-1); index--;
				
			}
			if (command.contains("P")) {
				list.add(index, command.charAt(2));
				if( index < in.length()) index++;
			}
		}
		
		for ( char ch : list) {
			System.out.print(ch);
		}

		
	}

}
