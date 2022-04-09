package textIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex04 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		File dir = new File("C:"+File.separator+"Users"+File.separator+"worhk"+File.separator+"Desktop"+File.separator+"Zavaworkspace"+File.separator+"_ch02");
	
		File f = new File(dir,"ddd.txt");
		
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		SungJuk sj = (SungJuk)ois.readObject();
		
		System.out.println("이름 : " + sj.name);
		System.out.println("국어점수 : " + sj.kor);
				
	}

}
