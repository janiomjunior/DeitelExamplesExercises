
public class exercise14518 {

	public static void main(String[] args) {
	      int principal = 1000; // initial amount before interest
	      int rate = 5; // interest rate

	      // display headers
	      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

	      // calculate amount on deposit for each of ten years
	      for (int year = 1; year <= 10; ++year) {                  
	         // calculate new amount on deposit for specified year  
	         double amount = principal * Math.pow(1.0 + rate, year);
	                                                                
	         // display the year and the amount                     
	         System.out.printf("%4d%,20.2f%n", year, amount);       
	      }                                                         
	   } 
	} 
