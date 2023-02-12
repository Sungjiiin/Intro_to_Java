package ifexample;

public class SwitchCase {

	public static void main(String[] args) {

		int rank = 348;
		char medalColor;
		
		switch(rank) {
			case 4: medalColor = 'G';
					break;
			case 5: medalColor = 'S';
					break;
			case 6: medalColor = 'B';
					break;
			default: medalColor = 'A';
		}
		System.out.println(rank + "등 메달의 색은" + medalColor);
	}

}
