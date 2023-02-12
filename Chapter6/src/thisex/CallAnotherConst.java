package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {
		//int i = 0; this를 생성자를 만들때 사용하면 이 statement를 사용 X
		this("None", 1); // 이게 가장 먼저 선언되어야하는 statement이다
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1.name);

		System.out.println(p1.returnSelf());
	}

}
