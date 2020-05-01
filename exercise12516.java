import java.util.Scanner;

public class exercise12516 {

	public static void main(String[] args) {
		
		int number;
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int count = 0;
		int i;
		Scanner input = new Scanner (System.in);
		
		do {
			
			System.out.println("Write a number or type 0 to stop: ");
			number = input.nextInt();
			System.out.println();
			count++;
			switch(count) {
			case 1:
				number1 = number;
				continue;
			case 2:
				number2 = number;
				continue;
			case 3:
				number3 = number;
				continue;
			case 4:
				number4 = number;
				continue;
			case 5:
				number5 = number;
				continue;
				
				
			}
			
		}while(count <= 4);
		for (i = 1; i <= number1; i++)
			System.out.print("*");
			System.out.println();
		
		for (i = 1; i <= number2; i++)
			System.out.print("*");
			System.out.println();
		
		for (i = 1; i <= number3; i++)
			System.out.print("*");
			System.out.println();
		
		for (i = 1; i <= number4; i++)
			System.out.print("*");
			System.out.println();
		
		for (i = 1; i <= number5; i++)
			System.out.print("*");
			System.out.println();

	}

}
