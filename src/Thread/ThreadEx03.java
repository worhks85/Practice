package Thread;

import java.util.Date;
import java.text.SimpleDateFormat;

class TimeThread extends Thread{
	public void run() {
		while(true) {
		Date date = new Date();	//�ý����� �ð��� �����ͼ� ��ü�� ����� �ش�.
		SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
		//����� ����� �����Ѵ�.
		System.out.println("����ð� : " + sdf.format(date));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {} 
		}
	}
}
public class ThreadEx03 {

	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.setDaemon(true);//���� ���踦 �δ´�. ������ ������ ���� �����ڴ�.
		tt.start();
		try {
			tt.join(5000);
			Thread.sleep(5000);
		} catch (InterruptedException e) {} 
		
		
		
		
		
	}

}
