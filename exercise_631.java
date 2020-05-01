import java.util.Scanner;

public class exercise_631 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random;
		int tries = 0;
		
		
		Scanner input = new Scanner (System.in);
		
		do {
			double guessNumber = Math.ceil(1 + Math.random()*999);
			System.out.println("Enter a guess number between 1 and 1000 or 0 to exit: ");
			random = input.nextInt();
			if(random != 0) {
				tries ++;
				
			
				do {


					if (random == guessNumber) {
						
						if (tries <= 10) {
							System.out.println("Either you know the secret or you got lucky!");
						}else if (tries == 10) {
							System.out.println("Aha you know the secret!");
						}else
							System.out.println("You should be able to do better!");
						random = 0;
					}else if (guessNumber > random) {
						System.out.println("Too Low. Try again !");
						System.out.println("Enter a new try or 0 to exit: ");
						random = input.nextInt();
						if(random != 0) {
							tries ++;
						}
					}else {
						System.out.println("Too High. Try again !");
						System.out.println("Enter a new try or 0 to exit: ");
						random = input.nextInt();
						if(random != 0) {
							tries ++;
						}
					}
				}while(random != 0);
			}
			
		}while (random != 0);
		
	}

}


