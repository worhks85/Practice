package byteIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * byte ��� 
 * - ��Ʈ���� ����Ʈ ������ �����͸� ����
 * - FileOutputSteam Ŭ������ �̿��Ͽ� ���
 * 
 * �ַ� write()
 * 
 * FileInputStreamŬ������ �̿��Ͽ� �Է�
 * - read() �޼ҵ带 �̿��Ͽ� ������ �ڷḦ ������
 * - �������� ���� -1
 * 
 * 
 */
public class Ex01 {

	public static void main(String[] args) throws IOException{
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(f,true);
		//��ü ������ true�̸� �̾�� false�̸� �ٽþ���
		//fos.write(65);
		fos.write('B');
		fos.write('A');
		String msg = "Hello Java!!";
		byte by[] = msg.getBytes();
		fos.write(by);
		fos.write(by, 6,4);	 //write (���ڿ��迭 , ������, �����)
		
		
		
	}

}
