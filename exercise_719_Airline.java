//import java.util.Arrays;
import java.util.Scanner;

public class exercise_719_Airline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] seats = {false, false, false, false, false, false, false, false, false, false};
		boolean flag = false;
		Scanner input = new Scanner (System.in);
		int count = 10;
		int YorN;
		
		do {
			
			System.out.println("Please, type 1 for first class or 2 economy: ");
			int number = input.nextInt();
			if (number == 1) {
				for(int i = 0; i <= 1 ; i++) {
					if (seats[i]== false && flag == false) {
						seats[i] = true;
						 flag = true;
						 System.out.println("Your plan section is First-Class and your seat is number " + (i+1) );
					}else if (seats[1]== true ) {
						System.out.println("First-Class is full, dont you want to try section Economy? 1 to Yes or 2 to No ");
						YorN = input.nextInt();
						if(YorN == 1) {
						for (int j = 5; j <= 6; j++){
							if (seats[j] == false && flag == false) {
								seats[j] = true;
								 flag = true;
								 System.out.println("Your plan section is Economy and your seat is number " + (j+1) ); 
							}else if(seats[6]== true) {
								System.out.println("The flight is full");
								System.exit(0);;
							}
						}
						}else
							System.out.println("The flight will leaves in 3 hours");
							break;
					}
			} 
			}else {
				for(int i = 5; i <= 6 ; i++) {
					if (seats[i]== false && flag == false) {
						seats[i] = true;
						 flag = true;
						 System.out.println("Your plan section is Economy-Class and your seat is number " + (i+1) );
					}else if (seats[6]==true) {
						System.out.println("Economy-class is full, dont you want to try section First-Class? 1 to Yes or 2 to No ");
						YorN = input.nextInt();
						if(YorN == 1) {
							for (int j = 0; j <= 1; j++){
								if (seats[j]== false && flag == false) {
									seats[j] = true;
									flag = true;
									System.out.println("Your plan section is Economy-Class and your seat is number " + (j+1) ); 
								}else if(seats[1]== true) {
									System.out.println("The flight is full");
									System.exit(0);
							}
						}
						}else
							System.out.println("The flight will leaves in 3 hours");
							System.exit(0);
					}
			}
			}
			count--;
			flag = false;
			System.out.println();
				
		}while (count >= 0);
		
		
		}

}

