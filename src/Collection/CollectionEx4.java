package Collection;
/*
 *  ȸ���� �μ� : ���ߺ� , ������ , �ѹ��� , ������
 *  ���ߺ� - ȫ�浿 , ȫ��� , ����ȣ
 *  
 *  �ο��� ����. ���� Ű ���� �μ���, �����ʹ� HashSetŸ������ ����
 *  
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Company{
	private HashMap map;
	private Scanner in;
	private HashSet[] hs;
	private String aa[];

	public Company() {
		map = new HashMap();
		in = new Scanner(System.in);
		hs = new HashSet[4];
		for (int i = 0 ; i<4 ; ++i) {
			hs[i] = new HashSet();
		}
		aa= new String[] {"���ߺ�", "������","�ѹ���","������"};

	}


	public void insert() throws IOException{
		int select = System.in.read() -48 ;
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		hs[select-1].add(name);
		map.put(aa[select-1], hs[select-1]);
	}
	public void edit() {


	}
	public void delete() throws IOException {
		System.out.print("1.���ߺ� 2.������ 3.�ѹ��� 4.������ : ");
		int select = System.in.read()-48;
		HashSet delete = (HashSet)map.get(aa[select-1]);


	}
	public void view() throws IOException{
		System.out.print("1.���ߺ� 2.������ 3.�ѹ��� 4.������ : ");
		int select = System.in.read()-48;
		HashSet view = (HashSet)map.get(aa[select-1]);

	}
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}



public class CollectionEx4 {

	public static void main(String[] args) throws IOException {
		Company com = new Company();
		while(true) {
			System.out.print("1.�Է� 2.���� 3.���� 4.���� 5.���� :");
			int select = System.in.read() -48;
			while(System.in.read() !='\n') {}
			switch (select){
			case 1: com.insert(); break;
			case 2: com.edit(); break;
			case 3: com.delete(); break;
			case 4: com.view(); break;
			case 5: com.exit(); break;
			default: System.out.println("�߸� �Է��ϼ˽��ϴ�.");

			}





		}

	}
}
