package byteIO;

import java.io.*;


public class Ex03 {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"aaa.txt");
		
		FileInputStream fls = new FileInputStream(f);
		
		while (true) {
			int res = fls.read();// �ѱ��ھ� �ƽ�Ű �ڵ尪���� �޴´�.
			if (res == -1 )break; // ����Ʈ �Է¿� ������ ���� (EOF = -1)
			System.out.println((char)res);
			
		}
		
	}

}
