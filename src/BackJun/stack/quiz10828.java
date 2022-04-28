package BackJun.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class quiz10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String com;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (cnt != 0 ) {
			cnt--;
			com = br.readLine();
			if (com.equals("pop")) {
				if(list.size() != 0 ) {
					System.out.println(list.get(0));
					list.remove(0);
				}else System.out.println("-1");
					
			}else if (com.equals("size")) {
				System.out.println(list.size());
			}else if (com.equals("empty")) {
				if(list.size() ==0) {
					System.out.println(1);
				}else System.out.println(0);
			}else if (com.equals("top")) {
				if( list.size() != 0)System.out.println(list.get(0));
				else System.out.println(-1);
			}else if (com.contains("push")) {
				int su = Integer.parseInt(com.substring(5));
				list.add(0, su);
			}
			
		}
		
		
		
	}

}
