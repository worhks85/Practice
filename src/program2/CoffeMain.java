package program2;

import java.util.Scanner;

public class CoffeMain {
	
	public static void main(String[] args) {
		CoffeService service = new CoffeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("(1) �մ� \n(2) Ŀ�Ǽ� ����� \n(3) ���α׷� ����");
			
			int choice = sc.nextInt();
			if (choice ==1 ) {
				Loop1 : while (true) {
					System.out.println("############Ŀ�Ǽ� �ֹ��ϱ�#############");
					System.out.println("1. ��ü �޴����� 2.�� �����ϱ�");
					System.out.println("3. �޴� �ֹ��ϱ� 4.�ܾ� Ȯ��");
					System.out.println("5. Ŀ�Ǽ� ������");
					
					System.out.println("#####################################");
					System.out.println();
					System.out.println("�޴� �Է� : ");
					choice = sc.nextInt();
					
					switch (choice) {
					case 1: service.viewAll();	break;
					case 2: service.chargeMoney();break;
					case 3:service.order();break;
					case 4:service.showMoney();break;
					case 5:	System.out.println("������ �ǿ�����"); break Loop1;
					default: System.out.println("�߸� �Է��߽��ϴ�.");
					}
					
				}
			}else if(choice == 2) {
				Loop2 : while(true) {
					System.out.println("#############Ŀ�Ǽ� ���� ���α׷� ############");
					System.out.println("1. ��ü �޴����� 2. Ŀ�Ǹ޴� ���");
					System.out.println("3. �޴� ���� 4. �޴� ����");
					System.out.println("5. ������");
					System.out.println("##########################################");
					System.out.println();
					System.out.println("�޴� �Է� : ");
					choice = sc.nextInt();
					switch(choice) {
					case 1: service.viewAll(); break;
					case 2: service.menuAdd(); break;
					case 3: service.menuEdit(); break;
					case 4: service.menuDel(); break;
					case 5:System.out.println("���� ���α׷��� �����մϴ�."); break Loop2;
					default : System.out.println("�߸� �Է��߽��ϴ�.");
					}
					
				}
				
			}else if (choice ==3) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}else System.out.println("�߸� �Է��߽��ϴ�.");
			
			
		}
	}

}
