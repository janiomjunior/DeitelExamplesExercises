
public class exercise11515 {

	// Exercise 5.15 Solution: Triangles.java
	// Program prints four triangles, one below the other
	   // draws four triangles
	/**
	 * @param args
	 */
	// Exercise 5.15 Solution: Triangles.java
	// Program prints four triangles, one below the other
	public static void main(String[] args) {
		
	      int row; // the row position
	      int column; // the column position
	      int space; // number of spaces to print
	      int line;

	      // first triangle
	   //   for ( line = 1; line <= 10; line++ )
	   //   {
	      System.out.printf("%s%10s%10s%10s%n", "(a)", "(b)","(c)","(d)");
	      for ( row = 1; row <= 10; row++ )
	      {
	    	  	 for ( column = 1; column <= row; column++ )
	    	  		 System.out.print( "*" );
	         
	    	  	 for ( space = 10; space > row; space-- )
		            System.out.print( " " );
	        
	       //  for ( row = 10; row >= 1; row-- )
		    //  {
		         for ( column = 10; column >= row; column-- )
		            System.out.print( "*" );
		         
		         for ( space = 1; space <= row; space++ )
			            System.out.print( " " );
		     
		         for ( column = 10; column >= row; column-- )
			            System.out.print( "*" );
		         
		         for ( space = 1; space <= row; space++ )
			            System.out.print( " " );
		         
		         for ( column = 1; column <= row; column++ )
			            System.out.print( "*" );
			         
			     for ( space = 10; space > row; space-- )
				        System.out.print( " " );
		         
			     System.out.println();
			     System.out.println();
			     System.out.println();
		      } // end for loop
		         //System.out.println();
	      }
	}
	//}

	



