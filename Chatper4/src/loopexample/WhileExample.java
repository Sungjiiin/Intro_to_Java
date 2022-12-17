package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0 ;
		do {// do 블럭안에 수행문이 무조건 한번은 수행된다
			
			sum += num; // sum을 초기화 안하면 이렇게 빨간색 밑줄 나옴
			num++; // num += 1과 동일
		}
		while(num <= 10);
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");
	}

}
