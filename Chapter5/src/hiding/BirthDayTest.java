package hiding;

class BirthDay {

	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if( day < 1 || day > 28) {
				System.out.println("Error");
			}
		}
		else {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

public class BirthDayTest { // 하나의 파일안에 클래스가 여러개일수있음
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
		day.setYear(2011);
		day.setMonth(2);
		day.setDay(30);
	}
	
}