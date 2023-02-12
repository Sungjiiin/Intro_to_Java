package staticex;

public class Student {

	//static int serialNum = 10000;
  	private static int serialNum = 10000;
	// private으로 선언하면 외부에선 호출할수 없는데,
	// 호출하고 싶으면 별도의 static 호출 method를 사용해야함
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
		
	}
	
	public static int getSerialNum() {
		int i = 10; // 이건 지역변수 = 이 안에서만 사용되고 끝!
		
		i++;
		System.out.println(i);
		
		//studentName = "blea"; 인스턴스 변수는 static method에서 할당X
		return serialNum; // 클래스 변수 
	}
}
