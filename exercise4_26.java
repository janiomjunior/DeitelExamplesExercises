


	   // Exercise 4.26: Mystery3.java
	   public class exercise4_26 {
	      public static void main(String[] args) {
	         int row = 10;
	 
	         while (row >= 1) {
	            int column = 1;
	 
	            while (column <= 10) {
	             System.out.print(row % 2 == 1 ? "<" : ">");
	             ++column;
	           }
	
	           --row;
	           System.out.println();
	       }
	     }
	  }
