package classpart;

public class StudentTest {

	public static void main(String[] args) {//클래스의 주기능을 구동하는 main(), 형식은 항상 동일하다
		// jvm이 호출해주는 함수!
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfor();
		
		System.out.println(studentLee);
	}

}
