package binary;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum); // iNum의 값은 변하지 않고
		System.out.println(bNum); // bNum으로 할당될때 변한다는점 4바이트 중에 일부만 짤리니까 앞의 1이 음수로 처리 즉 오류가 날수도 있다!
		
		double dNum = 3.14;
		iNum = (int)dNum;
		
		System.out.println(iNum);
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; // 3+0
		int num2 = (int)(dNum + fNum); // int(3.14+0.9 = 4.13) 
		// 형변환을 할때 소수점 부분이 truncate 되니까 이걸 고려해야함

		System.out.println(num1);
		System.out.println(num2);
	}

}
