package loopexample;

public class ContinueExample {

	public static void main(String[] args) {

		int tot = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if( (num % 2) == 1 ) {
				continue;
			}
			tot += num;
		}
		System.out.println(tot);
	}

}
