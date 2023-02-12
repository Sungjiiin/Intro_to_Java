package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis(); // 두개가 같다.
		
		System.out.println(b2);
		b2.printThis(); // 두개가 같다. 다만 b1과 b2는 다르게 호출된거라 다름
	}

}
