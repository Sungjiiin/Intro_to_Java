package ifexample;

public class IfExample1 {

	public static void main(String[] args) {

		int age = 2;
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다"); //블럭이 시작되면 들여쓰기 하는 습관을 들이기
			System.out.println("test"); //블럭이 시작되면 들여쓰기 하는 습관을 들이기
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
