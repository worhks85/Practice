package network;

import java.net.*;
import java.io.*;

public class Ex04 {

	public static void main(String[] args) {
		//TCP 클라이언트
		InetAddress ia = null;
		Socket soc = null;
		
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia,12345);
			String msg = "자바 네트워크 프로그램";
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg +"\n");
			pw.flush();
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println("서버에서 온 메세지 : " + msg);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("클라이언트 끝!");
	}

}
