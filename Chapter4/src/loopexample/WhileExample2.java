package loopexample;

public class WhileExample2 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0 ;
		while( num <= 10 ) {
			
			sum += num; // sum을 초기화 안하면 이렇게 빨간색 밑줄 나옴
			num++; // num += 1과 동일
		}
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");
	}

}
