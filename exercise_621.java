import java.util.Scanner;

public class exercise_621 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        //boolean check;
	        //int i = 0;
	        int number = 0;
	     //   int digit1;
	      //  int digit2;
	       // int digit3;
	       // int digit4;
	      //  int digit5;
	           
	        
	        while (number != 1) {
	        	
	        	System.out.print("Integer 5-digit: ");
		        number = in.nextInt();
		        
	        	if(number < 100000) {
	        		if(number > 10) {
	        			displayDigits(number);;
	        		}else {
	        			System.out.print("Error..." +  "\n" + "Re-enter 5-digit number: ");
	        			number = in.nextInt();
	        		}
	        	}else {
	        		System.out.print("Error..." +  "\n" + "Re-enter 5-digit number: ");
	        		number = in.nextInt();	
	        	}
	        	
	        }
	}
	
	static int integerPart (int a, int b) {
		int quotient = a/b;
		return quotient;
	}
	static int remainder (int a, int b) {
		int remainder = a % b;
		return remainder;
	}
	static void displayDigits (int number) {
		int digit1 = 0;
		int digit2 = 0;
		int digit3 = 0;
		int digit4 = 0;
		int digit5 = 0;
		
		int raux = 0;
		
		int quotient1 = integerPart(number,10000);
		int quotient2 = integerPart(number, 1000);
		int quotient3 = integerPart(number, 100);
		int quotient4 = integerPart(number, 10);
		int quotient5 = integerPart(number, 1);
		
		int remainder1 = remainder(number, 10000);
		int remainder2 = remainder(number, 1000);
		int remainder3 = remainder(number, 100);
		int remainder4 = remainder(number, 10);
		int remainder5 = remainder(number, 1);
		//int quotient5 = integerPart(number, 1);
		
		if (quotient1 == 0) {
			if(quotient2 == 0) {
				if(quotient3 == 0) {
					if(quotient4 == 0) {
						digit4 = quotient4;
						digit5 = remainder5;
					}
					 
				}else {
					digit3 = quotient3;
					digit4 = integerPart(remainder3, 10);
					digit5 = remainder(remainder3, 10);
				}
			}else {
				digit2 = quotient2;
				digit3 = integerPart(remainder2,100);
				raux = remainder(remainder2,100);
				digit4 = integerPart(raux, 10);
				digit5 = remainder(raux, 10);
			}
		}else {
			digit1 = quotient1;
			digit2 = integerPart(remainder1, 1000);
			raux = remainder(remainder1, 1000);
			digit3 = integerPart(raux, 100);
			int raux2 = remainder(raux, 100);
			digit4 = integerPart(raux2, 10);
			digit5 = remainder(raux2, 10);
		}
		
		System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 );
	}
}
