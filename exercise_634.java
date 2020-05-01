import java.util.Scanner;

public class exercise_634 {
	
	/*
	 * private static final int A = 10; private static final int B = 0; private
	 * static final int C = 0; private static final int D = 0; private static final
	 * int E = 0; private static final int F = 0;
	 */

	public static void main(String[] args) {
		
		int number = 0;
		//Scanner input = new Scanner(System.in);
		
		//System.out.println("Enter de conversion number: ");
		//number = input.nextInt();
		
		int remainder;
		int quotient;
		for (int i = 699; i <= 699; i++) {
			number = i;
			System.out.println();
			System.out.println("Decimal: " + number);
			System.out.println("Binary");
			do {
				
				remainder = number % 2;
				quotient = number/2;
			
			 
			
					System.out.print(" " + remainder );
			
				
					number = quotient;
					//remainder = quotient % 2;
			
			}while (quotient >= 1);
			number = i;
			System.out.println();
			System.out.println("Octal");
			
			do {
				
				remainder = number % 8;
				quotient = number/8;
			
			 
			
					System.out.print(" " + remainder );
			
				
					number = quotient;
					//remainder = quotient % 2;
			
			}while (  quotient >= 1);
			number = i;
			System.out.println();
			System.out.println("HEXA");
			do {
				
				remainder = number % 16;
				quotient = number/16;
			
				if (remainder > 10) {
					//String remHex;
					switch(remainder) {
					
					case 10:
						System.out.print(" A ");
						break;
					case 11:
						System.out.print(" B ");
						break;
					case 12:
						System.out.print(" C ");
						break;
					case 13:
						System.out.print(" D ");
						break;
					case 14:
						System.out.print(" E ");
						break;
					case 15:
						System.out.print(" F ");
						break;
					}
					
				}else
					System.out.print(" " + remainder );
			
				
					number = quotient;
					//remainder = quotient % 2;
			
			}while (  quotient >= 1);
		}
	
	
	
}
}

