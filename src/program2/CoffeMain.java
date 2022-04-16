package program2;

import java.util.Scanner;

public class CoffeMain {
	
	public static void main(String[] args) {
		CoffeService service = new CoffeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("(1) 손님 \n(2) 커피숍 사장님 \n(3) 프로그램 종료");
			
			int choice = sc.nextInt();
			if (choice ==1 ) {
				Loop1 : while (true) {
					System.out.println("############커피숍 주문하기#############");
					System.out.println("1. 전체 메뉴보기 2.돈 충전하기");
					System.out.println("3. 메뉴 주문하기 4.잔액 확인");
					System.out.println("5. 커피숍 나가기");
					
					System.out.println("#####################################");
					System.out.println();
					System.out.println("메뉴 입력 : ");
					choice = sc.nextInt();
					
					switch (choice) {
					case 1: service.viewAll();	break;
					case 2: service.chargeMoney();break;
					case 3:service.order();break;
					case 4:service.showMoney();break;
					case 5:	System.out.println("다음에 또오세요"); break Loop1;
					default: System.out.println("잘못 입력했습니다.");
					}
					
				}
			}else if(choice == 2) {
				Loop2 : while(true) {
					System.out.println("#############커피숍 관리 프로그램 ############");
					System.out.println("1. 전체 메뉴보기 2. 커피메뉴 등록");
					System.out.println("3. 메뉴 수정 4. 메뉴 삭제");
					System.out.println("5. 나가기");
					System.out.println("##########################################");
					System.out.println();
					System.out.println("메뉴 입력 : ");
					choice = sc.nextInt();
					switch(choice) {
					case 1: service.viewAll(); break;
					case 2: service.menuAdd(); break;
					case 3: service.menuEdit(); break;
					case 4: service.menuDel(); break;
					case 5:System.out.println("관리 프로그램을 종료합니다."); break Loop2;
					default : System.out.println("잘못 입력했습니다.");
					}
					
				}
				
			}else if (choice ==3) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else System.out.println("잘못 입력했습니다.");
			
			
		}
	}

}
