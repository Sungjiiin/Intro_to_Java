package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100); // 안의 인스턴스는 생성된 버스 인스턴스가 들어감
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
	}

}
