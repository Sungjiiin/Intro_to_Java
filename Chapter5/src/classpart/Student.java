package classpart;

public class Student {
	
	int studentID;
	String studentName; // 문자열 표시할때 string class를 써보자
 	int grade;
	String address;
	
	//public Student() {} 이렇게 같은 이름을 가진 생성자가 존재한다 : 생성자 오버라이딩
	
	//public Student(int id, String name) { //이게 있으면 다른 클래스에서 이 생성자를 쓸때 안의 특성들을 명시해주어야함
		//이 객체가 생성될때 id, name을 갖고싶다
	//	studentID = id;
	//	studentName = name;
	//}
	public void showStudentInfor() {//기능 구현
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentname() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) { // main은 클래스내에 꼭 있어야하는건 아니다
		// 이걸 jvm이 불러온다
		
		
		Student studentLee = new Student(); // 이게 생성자
		//studentLee가 heap memory에 생성
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시";
		
		Student studentKim = new Student(); // 이게 생성자
		//studentKim가 heap memory에 생성
		studentKim.studentName = "김유신";
		studentKim.studentID = 100;
		studentKim.address = "서울시";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
	}
}
