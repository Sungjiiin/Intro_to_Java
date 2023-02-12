package cooperation;

public class Subway {
	int lineNumber;
	int passengetCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		passengetCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("Subway" + lineNumber + "currennt: " + passengetCount + "money: " + money);
	}
}
