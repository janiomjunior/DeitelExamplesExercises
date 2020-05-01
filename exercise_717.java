import java.security.SecureRandom;

public class exercise_717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		int [] dies = new int [11];
		for(int i = 2; i < 36_000; i++) { 
			
			int die1 = 1 + randomNumbers.nextInt(6);
			int die2 = 1 + randomNumbers.nextInt(6);
			int sumdies = die1 + die2;
			for(int sum = 2 ; sum <= 12; sum++) {
				if( sum == sumdies) {
				  ++dies[sum-2];
				}
			}
	
		}
		System.out.println("         " + "1          "+"2          "+"3          "+"4          "+"5          "+"6          ");
		//int [] tally = new int [6];
		for (int row = 1; row <= 6; row++) {
			System.out.println();
			System.out.print(row + "        ");
			for ( int col = 1; col <= 6; col++) {
				// dies [row + col];
				System.out.print(dies [(row + col)-2]+ "        ");
			}
			
				
		}
	}

}
