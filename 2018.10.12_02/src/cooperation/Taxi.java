package cooperation;

public class Taxi {
	String companyName;
	int money;
	
	public Taxi(String companyName){
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(companyName + " �ý� ������ " + money + "�Դϴ�.");
	}
}