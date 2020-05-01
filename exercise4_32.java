
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise4_32 {
		
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
	        int decimal;
	           
	        System.out.print("Integer 4-digit: ");
	        number = in.nextInt();
	        while (i != 1) {
	        	if(number < 10000) {
	        		if(number > 999) {
	        			i = 1;
	        		}else {
	        			System.out.print("Error..." +  "\n" + "Re-enter 4-digit number: ");
	        			number = in.nextInt();
	        		}
	        	}else {
	        		System.out.print("Error..." +  "\n" + "Re-enter 4-digit number: ");
	        		number = in.nextInt();	
	        	}
	        	
	        }
	        if(i == 1) {
	        	//digit1 = number / 10000 ;
	        	digit2 = number / 1000;
	        	digit3 = number % 1000 / 100;
	        	digit4 = number % 1000 % 100 / 10;
	        	digit5 = number % 1000 % 100 % 10 / 1;
	        	
	        	decimal = digit5*1 + digit4*2 + digit3*4 + digit2*8;

	        		System.out.print("the decimal number is: " + decimal);
	        }
	}
}