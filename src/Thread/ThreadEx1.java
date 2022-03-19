package Thread;

/*
 * 프로세스 : 실행중인 프로그램
 * 멀티테스킹 : 동시에 여러가지 작업을 실행
 * 멀티스레드 : 두개 이상의 메소드가 동시에 실행하는것
 * 
 * 
 * 1. Thread클래스를 상속받음
 * 2. public void run() 메소드를 오버라이드 함
 * 3. start() 메소드를 호출하여 실행시킴
 * 
 * runnable 인터페이스를 이용하는 방법
 * 1. runnable 인터페이스를 상속받음
 * 2. public void run() 메소드를 오버라이드 함
 * 3. 생성자에 runnalbe 상속받은 클래스의 객체를 넣어 생성
 * 
 *  
 *  static int activeCount() - 현재 실행중인 thread의 갯수를돌려줌
 *  static Thread currentThread()  - 현재 실행중의 thread 객체의 참조를 돌려줌
 *  
 *	String getName()	- 이름을 돌려줌
 *	int getPriorty()	- 우선순위를 돌려줌
 *	
 *	synchronized - 동기화
 *	여러개의 스레드가 한 개의 자원을 사용하고자 할때, 해당 스레드를 제외하고 나머지는 접근을 막는것
 *
 *  
 */

class MyThread extends Thread{
	public void run() {
		System.out.println("현재 실행 되고있는 쓰레드의 갯수 : " + Thread.activeCount());
		System.out.println("현재 실행 되는 스레드의 상태 : " +Thread.currentThread());
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("main 스레드 시작!");
		MyThread mt = new MyThread();
		mt.setName("스레드-01");
		mt.setPriority(10); //1이 가장 늦다. 10이 빠르다
		mt.start();
		System.out.println("main 스레드 끝!");
		
		
		
	}

}
