package network;
import java.net.*;
import java.io.*;

public class Ex02 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		for (int i =1  ;i < 65536; ++i ) {
			try {
				ss= new ServerSocket(i);
				ss.close();
			}catch (IOException e) {
				System.err.println(i + "번은 이미 사용중입니다.");
			}
		}
		
		
		
	}

}
