package byteIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * byte 출력 
 * - 스트림은 바이트 단위로 데이터를 전송
 * - FileOutputSteam 클래스를 이용하여 출력
 * 
 * 주로 write()
 * 
 * FileInputStream클래스를 이용하여 입력
 * - read() 메소드를 이용하여 파일의 자료를 가져옴
 * - 데이터의 끝은 -1
 * 
 * 
 */
public class Ex01 {

	public static void main(String[] args) throws IOException{
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
		File f = new File(dir,"aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(f,true);
		//객체 생성시 true이면 이어쓰기 false이면 다시쓰기
		//fos.write(65);
		fos.write('B');
		fos.write('A');
		String msg = "Hello Java!!";
		byte by[] = msg.getBytes();
		fos.write(by);
		fos.write(by, 6,4);	 //write (문자열배열 , 어디부터, 몇글자)
		
		
		
	}

}
