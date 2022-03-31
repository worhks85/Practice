package textIO;

import java.io.*;

/*
 * text입출력
 * 한글자씩 전송이아닌 문자열 전송을 말함
 * - 한글자가 아니라서 버퍼에 넣고 보내야함
 * - 입력을 받을때는 줄 단위로 받음
 * 
 * 
 * FileWriter, OutputStreamWriter		파일    콘솔,네트워크
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
		
		pw.print("안녕하세요");
		pw.println("자바 강사입니다.");
		pw.println(20);
		pw.close();
		
		
		
	}

}
