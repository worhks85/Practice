package Thread;


class MyThread2 implements Runnable{
	public void run() {
		System.out.println("���� ���� �ǰ��ִ� �������� ���� : " + Thread.activeCount());
		System.out.println("���� ���� �Ǵ� �������� ���� : " +Thread.currentThread());
	}
	
}
public class ThreadEx02 {

	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		
		//mt.start();	�������̽��� ��ӹ����� start�޼ҵ�� ����
		mt2.run();
		
		
		
		
	}

}
