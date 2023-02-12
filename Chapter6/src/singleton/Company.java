package singleton;

public class Company {

	private static Company instance = new Company(); // 내부에서만 생성, 유일성
	private Company(){} // 이러면 외부에서는 이걸 함부로 생성X
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}
}
