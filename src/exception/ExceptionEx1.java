package exception;
/*
 * ���ܶ�?
 * - ������ ���۵��� �߻��ϴ� ���
 * - ���� ����� �������� ��ġ�� ���
 * - ������ �ƴ� ������� �߸��� �Էµ��
 * 
 * ���� ��Ȳ ����
 * - throw : ���� ����
 * - throws : ���� ����
 * - try{}catch(){} : ����ó��
 * 
 * ��������
 * -���ܰ� �߻����� ���, ���� ó���� �ϴ� ���� �ƴ϶�,
 * - �ٸ���(�ڽ��� ȣ���� ��) ���� ���ѱ�� ���
 * -> �޼ҵ�� �� ������ �����ϱ� ���� �ۼ�
 * 
 * ����ó��	( try ~ catch ~ finally )
 * - ���ܰ� �߻��� �ϸ� catch������ ó���� �ϰ�,
 * - ���ܹ߻��� ������ try���� ����
 * - finally���� try���� ������ ��Ƽ������� �ٷ� ����
 * - finally���� ��� ���ص� ��
 * 
 * ��������
 * -���ܸ� ������ �߻� ���Ѿ� �Ҷ� ����
 * 
 * ����Ŭ���� ����� ����
 * Exception Ŭ������ ��ӹ���
 * public string getMessage()�� �������̵� ��
 * getMessage()�ȿ� ������ ������ ��ȯ���� 
 * 
 */

import java.util.Scanner;

class SubException extends Exception{
	public SubException(String msg) {
		super(msg);
	}
	public String getMessage() {
		return super.getMessage() + "������ 0~100���� �Է��� �ּ���!!";
		
	}
}

public class ExceptionEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("���� ������ �Է� : ");
			int kor = sc.nextInt();
			if ( kor < 0 || kor > 100)	throw new SubException("����");
			
		}catch (SubException e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
   
   