package network;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Ex05 extends Thread {

	ServerSocket ss = null;
	Socket soc = null;
	PrintWriter pw = null;
	BufferedReader br = null;
	Scanner sc = null;
	public Ex05(){
		try {
			ss = new ServerSocket(12345);
			System.out.println("서버대기중...");
			soc = ss.accept();
			this.start();
			sc = new Scanner(System.in);
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			while(true) {
				System.out.println("클라이언트에 할 말 : ");
				String msg = sc.next();
				pw.println(msg);
				pw.flush();
			} 
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void run() {
		try {
		
		br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		while(true) {
			String msg = br.readLine();
			System.out.println( "클라이언트 에서 온말 : "+ msg );
		}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
		
	}

}
