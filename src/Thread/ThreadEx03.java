package Thread;

import java.util.Date;
import java.text.SimpleDateFormat;

class TimeThread extends Thread{
	public void run() {
		while(true) {
		Date date = new Date();	//시스템의 시간을 가져와서 객체로 만들어 준다.
		SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
		//출력의 양식을 지정한다.
		System.out.println("현재시간 : " + sdf.format(date));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {} 
		}
	}
}
public class ThreadEx03 {

	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.setDaemon(true);//데몬 관계를 맺는다. 메인이 끝나면 같이 끝내겠다.
		tt.start();
		try {
			tt.join(5000);
			Thread.sleep(5000);
		} catch (InterruptedException e) {} 
		
		
		
		
		
	}

}
