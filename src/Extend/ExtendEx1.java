package Extend;
/*
 * ���
 * 
 * - ���� Ŭ������ ���� �Ͽ� ���ο� Ŭ������ �ۼ�
 * - �� Ŭ������ �θ�� �ڽ� ���踦 �ξ��ִ°�
 * - �ڼ��� ������ ��� ����� �޾ƿ�
 * - Ű����� extends
 * 
 * Object class
 * - ������ ���� Ŭ����
 * - ��� Ŭ������ Object class�� �� ���������� ���
 * - ��� Ŭ������ �ְ� ����
 * 
 * ��Ӱ���
 * 
 * - ���� �κ��� ���󿡼� ����
 * - �����κ��� �ڼտ��� ����
 * - ������ ���� -> ��ӹ��� ��� Ŭ������ ����
 * - �ڼ��� ���� -> �ڼ��� Ŭ������ ����
 * 
 * �������̵� < -- > �����ε� = ������ ���°� ���� ����
 * - ���� Ŭ�����κ��� ��ӹ��� �޼����� ������ �ڽ� Ŭ������ �°� �����Ͽ� ���
 * 
 * super 
 * -������ ����� �ڽ��� ����� �����ϴµ� ����
 *  
 * 
 * 
 */

import java.util.Scanner;

class SungJuk{
	String name;
	int kor,eng,mat;
	int tot,rank;
	public void sumTot() {
		tot = kor + eng + mat;
	}
	public void disp() {
		System.out.print(name +"\t");
		System.out.print(kor +"\t");
		System.out.print(eng +"\t");
		System.out.print(mat +"\t");
		System.out.print(tot + "\t");
		System.out.print(rank + "\t\n");
		
	}
}
class SungJuk2 extends SungJuk{  
	
}
public class ExtendEx1 {

	public static void main(String[] args) {
		System.out.print("�ο����� �Է� :");
		Scanner sc = new Scanner(System.in);
		int inwon = sc.nextInt();
		SungJuk sj[] = new SungJuk[inwon];
		for (int i = 0 ; i < inwon ; ++i) {
			sj[i] = new SungJuk();
			System.out.print("�̸��� �Է��ϼ��� : ");
			sj[i].name = sc.next();
			System.out.print("���������� �Է��ϼ��� : ");
			sj[i].kor = sc.nextInt();
			System.out.print("���������� �Է��ϼ��� : ");
			sj[i].eng = sc.nextInt();
			System.out.print("���������� �Է��ϼ��� : ");
			sj[i].mat = sc.nextInt();
			sj[i].sumTot();
			sj[i].rank = 1;
		}
		for(int i = 0 ; i < inwon ; i++) {
			for (int j = 0 ; j < inwon ; j++) {
				if(sj[i].tot <sj[j].tot) sj[i].rank++;
			}
		}
		
		
		System.out.print("�̸�\t����\t����\t����\t����\t����\n");
		for (int i = 0 ; i < inwon;i++) sj[i].disp();

	
		
		
	}

}
