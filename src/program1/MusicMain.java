package program1;

import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicPlayerService service = new MusicPlayerServiceImpl();
		
		while (true) {
			System.out.println("##############���� �÷��̾� ##############");
			System.out.println("## 1. �뷡 ��ü ���");
			System.out.println("## 2. �뷡 �ֱ�");
			System.out.println("## 3. �뷡 �Ѱ� ���");
			System.out.println("## 4. �뷡 ����");
			System.out.println("## 5. �뷡 ��ü ����");
			System.out.println("## 6. ���� �÷��̾� ����");
			System.out.println("##############���� �÷��̾� ##############");
			
			System.out.print("���� >> ");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1 :
				service.play();break;
			case 2 :
				service.insert();break;
			case 3 :
				service.choicePlay();break;
			case 4 :
				service.choiceDel();break;
			case 5 :
				service.delete();break;
			case 6 :
				System.out.println("���� �÷��̾ ���ϴ�.");
				System.exit(0);
				default :
					System.out.println("�߸� �Է��ϼ˽��ϴ�");
			}
		}
		
		
		
	}

}
