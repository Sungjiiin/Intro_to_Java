package loopexample;

public class GuGuDanEx2 {

	public static void main(String[] args) {

		// 단보다 작은 경우만 출력하는 구구단 구현 
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				if(dan <= times)
					break;
				System.out.println(dan*times);
			}
			System.out.println();
		}
	}

}
