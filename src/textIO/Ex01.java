package textIO;

import java.io.*;

/*
 * text�����
 * �ѱ��ھ� �����̾ƴ� ���ڿ� ������ ����
 * - �ѱ��ڰ� �ƴ϶� ���ۿ� �ְ� ��������
 * - �Է��� �������� �� ������ ����
 * 
 * 
 * FileWriter, OutputStreamWriter		����    �ܼ�,��Ʈ��ũ
 * BufferedWriter
 * PrintWriter
 * 
 * FileReader,INputStreamReader
 * BufferedReader
 */
public class Ex01 {

	public static void main(String[] args) throws IOException{
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"ccc.txt");
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bwr = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bwr);
		
		pw.print("�ȳ��ϼ���");
		pw.println("�ڹ� �����Դϴ�.");
		pw.println(20);
		pw.close();
		
		
		
	}

}
