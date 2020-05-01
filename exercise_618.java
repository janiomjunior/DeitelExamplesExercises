import java.util.Scanner;

public class exercise_618 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		//String string;
		Scanner input = new Scanner( System.in );
		// System.out.print( "Enter a number (0 to exit): " );
		//number = input.nextInt();
		 
	      while ( number != 0 )
	      {
	    	  System.out.println();
	    	  System.out.println( " Enter a number (0 to exit): " );
	 		 number = input.nextInt();
	 		System.out.println( " Enter a character: " );
	 		 char fill = input.next().charAt(0);
	 		
	 		 squareOfAsterisks(number, fill);
	         
	         
	        // System.out.print( "Enter first number (0 to exit): " );
	         //number = input.nextInt();
	      } // end while loop
	   } // end method checkMultiples
	
   static void squareOfAsterisks(int sides, char fill) {
	for (int i = 1 ; i <= sides ; i++) {
		System.out.println();
		for (int j = 1 ; j <= sides ; j++) {
			
			 System.out.print(fill);
		}
	}
}
}
