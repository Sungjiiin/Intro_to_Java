package assignment;

public class OperationEx2 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num++); // 이게 끝나고 더하라는 뜻

		System.out.println(num); // 11
		//별거 아닌거 같은데 큰차이가 발생할수도 있음
		/*int num2 = 10;
		System.out.println(--num2); 

		System.out.println(num2); // 11
		//별거 아닌거 같은데 큰차이가 발생할수도 있음 */
		
		System.out.println(3<5);
		
		int num1 = 10;
		int num2 = 5;
		boolean flag = (num1 > num2);
		System.out.println(flag);
		
	}

}
