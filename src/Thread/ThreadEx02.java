package Thread;


class MyThread2 implements Runnable{
	public void run() {
		System.out.println("현재 실행 되고있는 쓰레드의 갯수 : " + Thread.activeCount());
		System.out.println("현재 실행 되는 스레드의 상태 : " +Thread.currentThread());
	}
	
}
public class ThreadEx02 {

	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		
		//mt.start();	인터페이스를 상속받으면 start메소드는 없다
		mt2.run();
		
		
		
		
	}

}
