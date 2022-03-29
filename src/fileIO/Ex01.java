package fileIO;
/*
 * I/O -> input / output의 약자
 * 컴퓨터 내부 또는 외부장치와 프로그램간에 데이터를 주고받는것
 * File I/O란 파일을 프로그램에서 쓰고 가져오는것을 말함
 * 
 * Stream - 데이터를 전달하는데 사용되는 장치
 * - 데이터는 한쪽으로만 처리할 수 있음 (입력과 출력을 같이 못함)
 * - 입력스트림과 출력 스트림이 따로 필요함
 * 
 * File class - 파일및 디렉토리 패스명의 추상표현
 * - 실제 파일이 존대해도 되고, 안해도 상관 없음
 * - 파일과 프로그램간의 연결통로를 만든다고 봄
 * 
 * File(String pathname)		-> 파일까지 or 폴더까지
 * File(String parent , String child)		(폴더명,파일명)
 * File(File parent,String child)			
 * File(URI uri)
 * 
 * Method
 * createNewFile()
 * createTempFile(String prefix,String suffix,File dir)
 * deleteOnExit(), delete()			프로그램이 끝날때, 즉시 지움
 * length() ->반환형은 long형			파일의 크기 구할때
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
		
		if (f3.createNewFile()) {	//파일이 없어서 만든다
			System.out.println("aaa.txt파일 생성중");
			
		}else  System.out.println("aaa.txt 파일이 존재합니다");
		File imsi = File.createTempFile("kgitbank", ".dat",dir);	//kgitbank(랜덤숫자).dat
		imsi.deleteOnExit();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		f3.delete();
		
		
	}

}




























