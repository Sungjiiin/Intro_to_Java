package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생이 추가될때마다 id가 자연 증가하면 좋겠어
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		System.out.println(Student.getSerialNum());
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		System.out.println(Student.getSerialNum());
	}

}
