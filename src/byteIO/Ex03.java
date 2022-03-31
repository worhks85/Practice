package byteIO;

import java.io.*;


public class Ex03 {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"aaa.txt");
		
		FileInputStream fls = new FileInputStream(f);
		
		while (true) {
			int res = fls.read();// 한글자씩 아스키 코드값으로 받는다.
			if (res == -1 )break; // 바이트 입력에 파일의 끝값 (EOF = -1)
			System.out.println((char)res);
			
		}
		
	}

}
