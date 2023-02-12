package loopexample;

public class GuGuDanEx {

	public static void main(String[] args) {

		// 짝수단만 수행하는 구구단 구현 
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0)
				continue;
			for(times = 1; times <= 9; times++) {
				System.out.println(dan*times);
			}
			System.out.println();
		}
	}

}
