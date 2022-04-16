package program2;
import java.util.*;
public class CoffeeServiceImpl implements CoffeService {

	HashMap<Coffee, Integer> map = new HashMap<Coffee, Integer>();
	
	Scanner sc = new Scanner(System.in);
	
	Client client = Client.getInstance();
	public CoffeeServiceImpl() {
		map.put(new Coffee("�Ƹ޸�ī��"), 2000);
		map.put(new Coffee("���ڶ�"), 3000);
	}
	@Override
	public void viewAll() {
		//��ü Ŀ�Ǽ� �޴� ���
		Set keyset = map.keySet();
		Iterator<Coffee> iterset = keyset.iterator();
		int cnt = 1;
		while (iterset.hasNext()) {
			Coffee key = iterset.next();
			System.out.println(cnt +"�� ° �޴� : "+ key.getCoffeeName() + "  ���� : " + map.get(key));
			cnt++;
		}
	}

	@Override
	public void menuAdd() {
		//�޴� �̸��� �޴� ������ �Է¹޾� �޴� ���
		System.out.print("�޴� �̸��� �Է��� �ּ��� : ");
		String menu = sc.next();
		System.out.println("������ �Է��� �ּ��� : ");
		int price = sc.nextInt(); 
		map.put (new Coffee(menu),price);
	}

	@Override
	public void menuEdit() {
		//�޴� �̸��� �Է¹޾� ���ݼ���		
		System.out.print("�޴� �̸��� �Է��� �ּ��� : ");
		String menu = sc.next();
		System.out.println("�ٲٽ� ������ �Է��� �ּ��� : ");
		int price = sc.nextInt(); 
		Set keyset = map.keySet();
		Iterator<Coffee> iterset = keyset.iterator();
		while (iterset.hasNext()) {
			Coffee coco = iterset.next();
			if(coco.getCoffeeName().equals(menu));
				map.replace(new Coffee(menu), price);
				return;
		}
		System.out.println("�ش� �޴��� �����ϴ�.");
		
	}

	@Override
	public void menuDel() {
		//�޴� �̸��� �Է¹޾� �޴�����
		System.out.print("�޴� �̸��� �Է��� �ּ��� : ");
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
		System.out.println("�ش� �޴��� �����ϴ�.");
	}

	@Override
	public void chargeMoney() {
		//���� ������ ����
		System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
		int money = sc.nextInt();
		client.setMoney(client.getMoney() + money);
		System.out.println("�ܾ��� " + client.getMoney()+"�� ���ҽ��ϴ�.");
	}

	@Override
	public void order() {
		// �޴� �̸��� �Է¹޾� �޴� �ֹ� ( �������ݿ��� �޴� ���ݸ�ŭ ����)
		System.out.println("� �޴��� �ֹ��Ͻðڽ��ϱ�?");
		String menu = sc.next();
		Set keyset = map.keySet();
		Iterator<Coffee> iterset = keyset.iterator();
		
		roof011 : while (iterset.hasNext()) {
			Coffee coffee = (Coffee) iterset.next();
			if (coffee.getCoffeeName().equals(menu)) break roof011;
			else System.out.println("�ش� ����� �����ϴ�."); return;
		}
		
		Coffee orderCoffee = new Coffee(menu);
		if (client.getMoney() - map.get(orderCoffee) <0) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		
		client.setMoney(client.getMoney() - map.get(orderCoffee) );
		System.out.println("���� �ܾ��� " + client.getMoney() + "��ŭ ���ҽ��ϴ�.");
		
	}

	@Override
	public void showMoney() {
		//������ Ȯ��
		System.out.println("���� �ܾ��� : " + client.getMoney() + "�� �Դϴ�.");
	}

}
