package binary;

public class CharcterEx {

	public static void main(String[] args) {

		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		ch = 66;
		
		System.out.println(ch); // ch를 char로 선언했기에, 숫자로 assign해도 해당하는 문자가 출력
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
	}

}
