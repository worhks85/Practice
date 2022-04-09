package textIO;

import java.io.*;

/*
 * 직렬화
 *  객체를 컴퓨터에썻다가 꺼내오던지, 네트워크를 통해 객체를 주고받을수 있게 해주는 작업
 *  Serialzation 객체를 데이터 스트림으로 만드는것
 *  반대로 개념을 역 직렬화라고함
 *  직렬화하고자 하는 클래스에 Serialzation을 상속 받으면 됨
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
	String name = "홍길동";
	int kor = 100;
	//transient 파일 밖으로 데이터를 보내지않음
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
