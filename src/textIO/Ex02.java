package textIO;

import java.io.*;

public class Ex02 {
public static void main(String[] args) throws IOException{
	File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
	File f = new File(dir,"ccc.txt");
	
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	while(true) {
		String msg = br.readLine();
		if(msg == null) break;
		System.out.println(msg);
	}
			
}
}
