package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student(100, "James");
		studentJames.setKorea(100);
		studentJames.setMath(80);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setKorea(90);
		studentTomas.setMath( 80);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
