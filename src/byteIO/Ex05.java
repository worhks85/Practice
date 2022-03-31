package byteIO;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"bbb.txt");
		
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		int a = dis.readInt();
		double b = dis.readDouble();
		String c = dis.readUTF();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
