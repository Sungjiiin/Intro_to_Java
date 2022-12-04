package binary;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10; //형변환 10(리터럴) - 상수풀에 4바이트 저장 - long(8바이트)에 형변환
		float fNum = lNum; //형변환 덜정밀한수 - 더정밀한수

		System.out.println(fNum);
		
		double dNum = fNum + num; // num이 float으로 형변환 - dNum이 float에서 double로 형변환
		System.out.println(dNum);
		
	}

}
