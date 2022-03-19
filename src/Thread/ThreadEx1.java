package Thread;

/*
 * ���μ��� : �������� ���α׷�
 * ��Ƽ�׽�ŷ : ���ÿ� �������� �۾��� ����
 * ��Ƽ������ : �ΰ� �̻��� �޼ҵ尡 ���ÿ� �����ϴ°�
 * 
 * 
 * 1. ThreadŬ������ ��ӹ���
 * 2. public void run() �޼ҵ带 �������̵� ��
 * 3. start() �޼ҵ带 ȣ���Ͽ� �����Ŵ
 * 
 * runnable �������̽��� �̿��ϴ� ���
 * 1. runnable �������̽��� ��ӹ���
 * 2. public void run() �޼ҵ带 �������̵� ��
 * 3. �����ڿ� runnalbe ��ӹ��� Ŭ������ ��ü�� �־� ����
 * 
 *  
 *  static int activeCount() - ���� �������� thread�� ������������
 *  static Thread currentThread()  - ���� �������� thread ��ü�� ������ ������
 *  
 *	String getName()	- �̸��� ������
 *	int getPriorty()	- �켱������ ������
 *	
 *	synchronized - ����ȭ
 *	�������� �����尡 �� ���� �ڿ��� ����ϰ��� �Ҷ�, �ش� �����带 �����ϰ� �������� ������ ���°�
 *
 *  
 */

class MyThread extends Thread{
	public void run() {
		System.out.println("���� ���� �ǰ��ִ� �������� ���� : " + Thread.activeCount());
		System.out.println("���� ���� �Ǵ� �������� ���� : " +Thread.currentThread());
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("main ������ ����!");
		MyThread mt = new MyThread();
		mt.setName("������-01");
		mt.setPriority(10); //1�� ���� �ʴ�. 10�� ������
		mt.start();
		System.out.println("main ������ ��!");
		
		
		
	}

}
