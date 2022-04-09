package textIO;

import java.io.*;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) throws IOException{
	File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
	File f = new File(dir,"ccc.txt");
	
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	while(true) {
		String msg = br.readLine();
		if(msg == null) break;
		Scanner sc = new Scanner(msg).useDelimiter("\\s*tt\\s*");
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(msg);
	}
			
}
}
