import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise4_31 {
		
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        //boolean check;
	        int i = 0;
	        int number = 0;
	        int digit1;
	        int digit2;
	        int digit3;
	        int digit4;
	        int digit5;
	           
	        System.out.print("Integer 5-digit: ");
	        number = in.nextInt();
	        while (i != 1) {
	        	if(number < 100000) {
	        		if(number > 9999) {
	        			i = 1;
	        		}else {
	        			System.out.print("Error..." +  "\n" + "Re-enter 5-digit number: ");
	        			number = in.nextInt();
	        		}
	        	}else {
	        		System.out.print("Error..." +  "\n" + "Re-enter 5-digit number: ");
	        		number = in.nextInt();	
	        	}
	        	
	        }
	        if(i == 1) {
	        	digit1 = number / 10000 ;
	        	digit2 = number % 10000 / 1000;
	        	digit3 = number % 10000 % 1000 / 100;
	        	digit4 = number % 10000 % 1000 % 100 / 10;
	        	digit5 = number % 10000 % 1000 % 100 % 10 / 1;
	        	
	        	if ((digit2 == digit4) & (digit1 == digit5)){
	        		System.out.println("The number is 5-digit Palindrome");
	        		
	        	}else
	        		System.out.println("The number is NOT 5-digit Palindrome");
	        }
	}
}


