package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) {//for 문안에 초기화, 조건 모두 생략하면 while 무한루프랑 동일
			
			sum += num;
			//num++; // 요런식으로 반복문 생략 가능 그냥 형식대로 하는게 바람직해

		}
		System.out.println(sum);
		System.out.println(num);
	}

}
