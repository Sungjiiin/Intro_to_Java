package binary;

public class ByteVariable {

	public static void main(String[] args) {

		byte bData = -128;
		System.out.println(bData); // ctrl+space를 누르면 사용가능한 변수가 나온다
		
		//byte bData2 = 128; // 타입이 맞지 않는건 바로 에러가 나온다
		byte bData2 = 127;
		System.out.println(bData2);
	}

}
