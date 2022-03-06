package Class;

import java.io.IOException;
import java.util.Scanner;

/*
Ŭ������?
�Ϲ�ȭ�� �Ӽ��� �޼ҵ�� ��ü�� ����Ѱ��� Ŭ���������

Ŭ������ �⺻ ����

����������	���������		class	class�̸�
						extendsŬ����		implements�������̽�{����ʵ�, ����޼ҵ�, ������, ��øŬ����}

Ŭ���� �ۿ� ���ϼ� �ִ� ���� package, import, �� �ٸ� Ŭ����

1. ����ʵ�
2. ����޼ҵ�
3. ������
4. ����������
5. ���������
6. ��øŬ����
7. ���
8. ������
9. �߻� 
10. �������̽�

�ڵ��� Ŭ���� �ȿ�

�޼ҵ�(���,����) = ���������δ�, �ӵ��� ���δ�, ���������, �ӵ��� ���δ� , ������ ���Ḧ ����
�ʵ� ( ����, �Ӽ�)= �߷�, ����, ��뿬��, �ְ�ӵ�, ����

�޼ҵ尡 �������� �ϳ��� Ŭ������ �ϼ�

Field 
 - ������ ������� (������� = ũ���� �ȿ� �ִ� ���)
 - ����) �޼ҵ� �ȿ��� ������ ������ ����������� ��
 
Method
 - Ư�� ������ ��� ���� ( ����޼ҵ� )  
 
 ���α׷��ֿ����� ��ü
 - ���¿� ������ ����ü�̴�. �� �Ӽ�(�ʵ�,����Ÿ) �� �޼ҵ�(�Լ� , ����)�� ����ü��
 
 �Ӽ� (�ʵ�)
 ��ü�� ���� Ư������ ��ü�� �������ִ� ������ �����ϴ� �����ҷ� ���Ǵ� �����Ϳ���
 
 �޼ҵ� (���)
 ��ü�� ���� Ư�����μ� ��ü�� �����͸� �������ϰų� �Ǵ� ��ü�� ������ �ִ� �Ӽ��� �����ϴ� ���� ��
 
 ��ä�� ����
 Ŭ������ ��ü�������� (�����̸�);
 
 ��ü�� ����
 ��ü�������� (�����̸�) = new Ŭ������();
 
 ��ü�� ����� ����
 Ŭ������ ��ü��������(�����̸�) = new Ŭ������();
 
				������
Car car01 = new Car();
���۷�������	�ν��Ͻ�����

 new ������ ������ Ŭ����()
 
������ : Ŭ�����κ��� ��ü�� ������ �� �ʱ�ȭ ������ ����ϴ� Ư���� �޼ҵ�
 - Ŭ������� ������ �޼ҵ�
 - ����� ���ϰ��� ����
 - ��ü ������ �ݵ�� �ϳ��� ������ ȣ��
 - �����ڸ� ������ �ڵ����� default�����ڰ� ���� (JVM)
 - ������ �����ε� �� �� ����
 - ��� �ʵ� �� �ʱ�ȭ�� ���� ���� �޼ҵ�
 - ��ü�� ������ ���� ����� ����
 
 this this()
 ��ü�� ���� �� �� ��ü �ڽ��� �ǹ�
 this �ڿ� ����
 
 
*/
class Room{
	boolean room[];
	Scanner sc;
	int roomsu;
	Room(){
		sc = new Scanner(System.in);
		System.out.print("�� �� ������ �Է� : ");
		int roomsu = sc.nextInt();
		room = new boolean[roomsu];
		
	}
	public void input() {
		System.out.print("�Խ��Ͻ� ���� ��ȣ " );
		int roomNumber = sc.nextInt();
		if (roomNumber > 10 || roomNumber < 1 ) input();
		if (room[roomNumber- 1]) {
			System.out.println(roomNumber+"ȣ���� ������Դϴ�.");
			
		}
		else {
			System.out.println(roomNumber+"ȣ�ǿ� �Խ��ϼ˽��ϴ�.");
			room[roomNumber-1] = true;
		}
	}
	public void output() {
		System.out.print("����Ͻ� ���� ��ȣ " );
		int roomNumber = sc.nextInt();
		if (roomNumber > 10 || roomNumber < 1 ) output();
		if (!room[roomNumber- 1]) {
			System.out.println(roomNumber+"ȣ���� ����Դϴ�.");
			
		}
		else {
			System.out.println(roomNumber+"ȣ�ǿ� ����ϼ˽��ϴ�.");
			room[roomNumber-1] = false;
		}
	}
	public void view() {
		for (int i = 0 ; i<roomsu ;++i) {
			if(room[i]) {
				System.out.println(i + 1 + "ȣ���� ������Դϴ�.");
			}
			else System.out.println("���� ����Դϴ�.");
		}
	}
	public void exit() {
		System.out.println("���α׷��� �����ϰڽ��ϴ�.");
		System.exit(0); // ���α׷� ��ü ����
	}
	
}
public class ClassEx1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		Room room = new Room();
		
		while (true) {
			System.out.print("1.�Խ� 2.��� 3.�溸�� 4.���� : ");
			int select = System.in.read()-48;
			sc.nextLine();
			switch (select) {
			case 1: 
				room.input(); break;
			case 2: 
				room.output(); break;
			case 3: 
				room.view(); break;
			case 4: 
				room.exit(); break;
			default:
				System.out.println("�߸� �Է� �ϼ˽��ϴ�.");
			}
			
			
		}
		
		
		

	}

}

