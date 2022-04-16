package program2;

public class Client {
	private Client() {
		
		
	}
	
	private static Client client = new Client();
	
	public static Client getInstance() {
		return client;
	}
	
	private int money;
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int Money) {
		this.money = this.money + money;
	}
	
	
	
}
