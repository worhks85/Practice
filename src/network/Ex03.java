package network;
import java.io.*;
import java.net.*;

public class Ex03 {

	public static void main(String[] args) {
		//TCP���� ��ǻ��
		ServerSocket ss =null;
		Socket soc = null;
		try {
			ss= new ServerSocket(12345);
			System.out.println("���� �����...");
			soc = ss.accept();
			System.out.println("������ ���� : " + soc.toString());
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String msg = br.readLine();
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			pw.print(msg + "\n");
			System.out.println("���۵� ���� : " +br.readLine());
			pw.close();
			
		}catch (IOException e) {
			
		}
		
		
	}

}
