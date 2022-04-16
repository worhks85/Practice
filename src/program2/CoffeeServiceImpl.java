package program2;
import java.util.*;
public class CoffeeServiceImpl implements CoffeService {

	HashMap<Coffee, Integer> map = new HashMap<Coffee, Integer>();
	
	Scanner sc = new Scanner(System.in);
	
	Client client = Client.getInstance();
	public CoffeeServiceImpl() {
		map.put(new Coffee("아메리카노"), 2000);
		map.put(new Coffee("초코라떼"), 3000);
	}
	@Override
	public void viewAll() {
		//전체 커피숍 메뉴 출력
		Set keyset = map.keySet();
		Iterator<Coffee> iterset = keyset.iterator();
		int cnt = 1;
		while (iterset.hasNext()) {
			Coffee key = iterset.next();
			System.out.println(cnt +"번 째 메뉴 : "+ key.getCoffeeName() + "  가격 : " + map.get(key));
			cnt++;
		}
	}

	@Override
	public void menuAdd() {
		//메뉴 이름과 메뉴 가격을 입력받아 메뉴 등록
		System.out.print("메뉴 이름을 입력해 주세요 : ");
		String menu = sc.next();
		System.out.println("가격을 입력해 주세요 : ");
		int price = sc.nextInt(); 
		map.put (new Coffee(menu),price);
	}

	@Override
	public void menuEdit() {
		//메뉴 이름을 입력받아 가격수정		
		System.out.print("메뉴 이름을 입력해 주세요 : ");
		String menu = sc.next();
		System.out.println("바꾸실 가격을 입력해 주세요 : ");
		int price = sc.nextInt(); 
		Set keyset = map.keySet();
		Iterator<Coffee> iterset = keyset.iterator();
		while (iterset.hasNext()) {
			Coffee coco = iterset.next();
			if(coco.getCoffeeName().equals(menu));
				map.replace(new Coffee(menu), price);
				return;
		}
		System.out.println("해당 메뉴는 없습니다.");
		
	}

	@Override
	public void menuDel() {
		//메뉴 이름을 입력받아 메뉴삭제
		System.out.print("메뉴 이름을 입력해 주세요 : ");
		String menu = sc.next();

		Set keyset = map.keySet();
		Iterator<Coffee> iterset = keyset.iterator();
		while (iterset.hasNext()) {
			Coffee coco = iterset.next();
			if(coco.getCoffeeName().equals(menu)) {
				map.remove(new Coffee(menu));
				return;
			}
		}
		System.out.println("해당 메뉴는 없습니다.");
	}

	@Override
	public void chargeMoney() {
		//고객의 충전금 충전
		System.out.println("얼마를 충전하시겠습니까?");
		int money = sc.nextInt();
		client.setMoney(client.getMoney() + money);
		System.out.println("잔액이 " + client.getMoney()+"원 남았습니다.");
	}

	@Override
	public void order() {
		// 메뉴 이름을 입력받아 메뉴 주문 ( 내충전금에서 메뉴 가격만큼 차감)
		System.out.println("어떤 메뉴를 주문하시겠습니까?");
		String menu = sc.next();
		Set keyset = map.keySet();
		Iterator<Coffee> iterset = keyset.iterator();
		
		roof011 : while (iterset.hasNext()) {
			Coffee coffee = (Coffee) iterset.next();
			if (coffee.getCoffeeName().equals(menu)) break roof011;
			else System.out.println("해당 음료는 없습니다."); return;
		}
		
		Coffee orderCoffee = new Coffee(menu);
		if (client.getMoney() - map.get(orderCoffee) <0) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		client.setMoney(client.getMoney() - map.get(orderCoffee) );
		System.out.println("현재 잔액이 " + client.getMoney() + "만큼 남았습니다.");
		
	}

	@Override
	public void showMoney() {
		//충전금 확인
		System.out.println("현재 잔액은 : " + client.getMoney() + "원 입니다.");
	}

}
