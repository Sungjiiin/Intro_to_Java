package cooperation;

public class Bus {

	int busNumber;
	int passengetCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		passengetCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("Bus" + busNumber + "currennt: " + passengetCount + "money: " + money);
	}
}
