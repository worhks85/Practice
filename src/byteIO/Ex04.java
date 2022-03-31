package byteIO;

import java.io.*;

/*
 * FileOutputStream 을 통해 받은 객체를 BufferedOutputStream에 넣음
 * DataOutputStream클래스에 버퍼클래스 객체를 넣어서 DataOutputStream내의 메소드로 잘라 파일에 저장함
 * 
 * 
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"bbb.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dis = new DataOutputStream(bos);
		
		int a = 10;
		double b = 10.23;
		String c = "kgitbank";
		
		dis.writeInt(a);
		dis.writeDouble(b);
		dis.writeUTF(c);
		
		dis.close();
		
				
		
	}

}
