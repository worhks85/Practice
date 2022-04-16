package program1;

import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicPlayerService service = new MusicPlayerServiceImpl();
		
		while (true) {
			System.out.println("##############뮤직 플레이어 ##############");
			System.out.println("## 1. 노래 전체 재생");
			System.out.println("## 2. 노래 넣기");
			System.out.println("## 3. 노래 한곡 재생");
			System.out.println("## 4. 노래 삭제");
			System.out.println("## 5. 노래 전체 삭제");
			System.out.println("## 6. 뮤직 플레이어 끄기");
			System.out.println("##############뮤직 플레이어 ##############");
			
			System.out.print("선택 >> ");
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
				System.out.println("뮤직 플레이어를 끕니다.");
				System.exit(0);
				default :
					System.out.println("잘못 입력하셧습니다");
			}
		}
		
		
		
	}

}
