package network;
import java.io.*;
import java.net.*;

public class Ex03 {

	public static void main(String[] args) {
		//TCP서버 컴퓨터
		ServerSocket ss =null;
		Socket soc = null;
		try {
			ss= new ServerSocket(12345);
			System.out.println("서버 대기중...");
			soc = ss.accept();
			System.out.println("접속자 정보 : " + soc.toString());
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String msg = br.readLine();
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			pw.print(msg + "\n");
			System.out.println("전송된 내용 : " +br.readLine());
			pw.close();
			
		}catch (IOException e) {
			
		}
		
		
	}

}
