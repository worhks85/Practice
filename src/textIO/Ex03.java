package textIO;

import java.io.*;

/*
 * ����ȭ
 *  ��ü�� ��ǻ�Ϳ����ٰ� ����������, ��Ʈ��ũ�� ���� ��ü�� �ְ������ �ְ� ���ִ� �۾�
 *  Serialzation ��ü�� ������ ��Ʈ������ ����°�
 *  �ݴ�� ������ �� ����ȭ�����
 *  ����ȭ�ϰ��� �ϴ� Ŭ������ Serialzation�� ��� ������ ��
 *  
 *  FileOutputStram
 *  BufferedOutputStream
 *  ObjectoutputStream
 *  
 *  
 * 
 * 
 * 
 */

class SungJuk implements Serializable{
	String name = "ȫ�浿";
	int kor = 100;
	//transient ���� ������ �����͸� ����������
}
public class Ex03 {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"ddd.txt");
		
		FileOutputStream fos= new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		SungJuk sj = new SungJuk();
		oos.writeObject(sj);
		oos.close();
				
		
		
		
	}
}
