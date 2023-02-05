package reference;

public class Student {
	
	int studentID;
	String studentName;
	/**int koreaScore;
	int mathScore;
	String koreaSubject;
	String mathSubject;
	
	int engScore;
	String engSubject; // 점점 늘어나버림...**/
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject("Korea");
		math = new Subject("Math"); // 요렇게 생성자에 이걸 넣어야 생성이 된다
	}

	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korea = new Subject("Korea");
		math = new Subject("Math"); // 요렇게 생성자에 이걸 넣어야 생성이 된다
	}
	
	public void setKorea(int score) {
		korea.setScore(score);
		
	}

	public void setMath(int score) {
		math.setScore(score);
		
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "'s total score:" + total);
	}
}
