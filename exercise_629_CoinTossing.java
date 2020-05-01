
public class exercise_629_CoinTossing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	coinToss();
	}
	static void coinToss() {
		int cheads = 0;
		int ctails = 0;
		for( int i = 1; i <= 1000000 ; i++) {
		double gumble =  Math.random();
		
		if (gumble > 0.5) {
			flip coin =	flip.HEADS;
			cheads ++;
			System.out.println(coin);
		}else {
			flip coin = flip.TAILS;
			ctails ++;
			System.out.println(coin);
			
		}
	}
		
		System.out.println("HEADS appears :" + cheads);
		System.out.println("TAILS appears :" + ctails);
		
	}
	public enum flip {
		
		HEADS, TAILS
		
	}

}
