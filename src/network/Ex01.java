package network;
/* TCP(Transfer Control Protocol)
 * ��ȭ�� �ɶ� ������ �޾ƾ� ��ȭ��ȭ�� �����ϰ�, ������ ��ȭ�� ������ ��ȭ�� �Ұ�����
 * ���� TCP ��ſ����� ������ְ� �߿���
 * 
 * InetAddress - ���������κ��� ���εǾ��ִ� IP�ּҸ� �����ϴ� Ŭ����
 * - ���� ���ͳ��� ����� ���� IP�ּҰ� �ƴ� �������̶�� ���� ����Ͽ� ��������
 * - ���ͳݻ��� ��� ����Ʈ�� ��� IP �ּҿ� �������� ���εǾ� ����
 * 
 * Static InetAddress getByName(String addr)
 * static InetAddress[] getAllByName(String addr)
 * static InetAddress getLocalHost()
 * String getHostAddress()
 * String getHostName()
 * 
 * ServerSocket - Ư�� ��ǻ�Ϳ� TCP��Ʈ�� ���� �װ����� ��û�޾����� ����ϴ�Ŭ����
 * - ������ǻ���Ϳ��� ��Ʈ��ȣ�� ������� Ŭ���̾�Ʈ ��ǻ�Ͱ� ������ �ؼ� ����� �Ҽ� ����
 * - ������ǻ���� ��Ʈ��ȣ�� �� �� ����ϴ� Ŭ����
 * - �̹̻������ ��Ʈ��ȣ�϶��� IOException �߻�
 * 
 * Socket - Ư�� ��ǻ�Ϳ� �����Ҷ� ����ϴ� Ŭ����
 * - IP�ּҿ� ��Ʈ��ȣ�� �˸�, �ش��ϴ� ��ǻ�Ϳ� ����� �� �� �ִµ� �̶� ���Ǵ� Ŭ����
 * - ���������� ServerSocket�� ���� ���� ��ǻ�ͷ� ��ü�߻�
 * - Ŭ���̾�Ʈ������ ipAddress�� ���� �����ϴ� �ּҿ� ������ ��Ʈ��ȣ�� ���� ��ü �߻�
 * 
 */
import java.net.*;
public class Ex01 {
	public static void main(String[] args) {
		InetAddress ia = null;
		InetAddress ias[] = null;
		try {
			ia = InetAddress.getByName("www.kgitbank.com");
			System.out.println("������ �ּ� : " + ia.getHostAddress());
			System.out.println("ȣ��Ʈ �̸� : " + ia.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			ias = InetAddress.getAllByName("www.naver.com");
			for (int i = 0 ; i < ias.length ;++i) {
				System.out.println("������ �ּ� : " + ias[i].getHostAddress());
				System.out.println("ȣ��Ʈ �̸� : " + ias[i].getHostName());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
