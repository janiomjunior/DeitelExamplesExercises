import java.util.Scanner;

public class exercise_630 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random;
		
		
		Scanner input = new Scanner (System.in);
		
		do {
			double guessNumber = Math.ceil(1 + Math.random()*999);
			System.out.println("Enter a guess number between 1 and 1000 or 0 to exit: ");
			random = input.nextInt();
			do {
				
			
				if (random == guessNumber) {
					System.out.println("You guessed the number!");
					random = 0;
				}else if (guessNumber > random) {
					System.out.println("Too Low. Try again !");
					System.out.println("Enter a new try or 0 to exit: ");
					random = input.nextInt();
				}else {
					System.out.println("Too High. Try again !");
					System.out.println("Enter a new try or 0 to exit: ");
					random = input.nextInt();
				}
			}while(random != 0);
			
			
		}while (random != 0);
	}

}
