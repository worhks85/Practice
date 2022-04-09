package network;

import java.net.*;
import java.io.*;

public class Ex04 {

	public static void main(String[] args) {
		//TCP Ŭ���̾�Ʈ
		InetAddress ia = null;
		Socket soc = null;
		
		try {
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia,12345);
			String msg = "�ڹ� ��Ʈ��ũ ���α׷�";
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg +"\n");
			pw.flush();
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println("�������� �� �޼��� : " + msg);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Ŭ���̾�Ʈ ��!");
	}

}
