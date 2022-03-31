package byteIO;

import java.io.*;

/*
 * FileOutputStream �� ���� ���� ��ü�� BufferedOutputStream�� ����
 * DataOutputStreamŬ������ ����Ŭ���� ��ü�� �־ DataOutputStream���� �޼ҵ�� �߶� ���Ͽ� ������
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
