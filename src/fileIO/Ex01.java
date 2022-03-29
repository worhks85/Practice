package fileIO;
/*
 * I/O -> input / output�� ����
 * ��ǻ�� ���� �Ǵ� �ܺ���ġ�� ���α׷����� �����͸� �ְ�޴°�
 * File I/O�� ������ ���α׷����� ���� �������°��� ����
 * 
 * Stream - �����͸� �����ϴµ� ���Ǵ� ��ġ
 * - �����ʹ� �������θ� ó���� �� ���� (�Է°� ����� ���� ����)
 * - �Է½�Ʈ���� ��� ��Ʈ���� ���� �ʿ���
 * 
 * File class - ���Ϲ� ���丮 �н����� �߻�ǥ��
 * - ���� ������ �����ص� �ǰ�, ���ص� ��� ����
 * - ���ϰ� ���α׷����� ������θ� ����ٰ� ��
 * 
 * File(String pathname)		-> ���ϱ��� or ��������
 * File(String parent , String child)		(������,���ϸ�)
 * File(File parent,String child)			
 * File(URI uri)
 * 
 * Method
 * createNewFile()
 * createTempFile(String prefix,String suffix,File dir)
 * deleteOnExit(), delete()			���α׷��� ������, ��� ����
 * length() ->��ȯ���� long��			������ ũ�� ���Ҷ�
 * 
 */
import java.io.*;
public class Ex01 {

	public static void main(String[] args) throws IOException{
		File f1 = new File("C:\\Users\\worhk\\Desktop\\Zavaworkspace\\_ch02\\aaa.txt");
		File f2 = new File("C:\\Users\\worhk\\Desktop\\Zavaworkspace\\_ch02","aaa.txt");
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		//File dir = new File("C:\\Users\\worhk\\Desktop\\Zavaworkspace\\_ch02");
		File f3 = new File(dir,"aaa.txt");
		
		if (f3.createNewFile()) {	//������ ��� �����
			System.out.println("aaa.txt���� ������");
			
		}else  System.out.println("aaa.txt ������ �����մϴ�");
		File imsi = File.createTempFile("kgitbank", ".dat",dir);	//kgitbank(��������).dat
		imsi.deleteOnExit();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		f3.delete();
		
		
	}

}




























