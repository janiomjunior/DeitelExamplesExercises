
public class exercise10514{ // Fig. 5.6: Interest.java
//Compound-interest calculations with for.


public static void main(String[] args) {
   double principal = 1000.0; // initial amount before interest
   double rate1 = 0.05; // interest rate
   double rate2 = 0.06;
   double rate3 = 0.07;
   double rate4 = 0.08;
   double rate5 = 0.09;
   double rate6 = 0.10;
   double amount; 

   // display headers
   System.out.printf("%s%20s%n", "Year", "Amount on deposit");

   // calculate amount on deposit for each of ten years
   for (int year = 1; year <= 10; ++year) {                  
      // calculate new amount on deposit for specified year  
	  for (int i = 1; i <= 6; i++) {
		  switch(i) {
		  case 1:
			  amount = principal * Math.pow(1.0 + rate1, year);
			  System.out.printf("%4d%,20.2f%n", year, amount); 
			  continue;
		  case 2:
			  amount = principal * Math.pow(1.0 + rate2, year);
			  System.out.printf("%4d%,20.2f%n", year, amount);   
			  continue;
		  case 3:
			  amount = principal * Math.pow(1.0 + rate3, year);
			  System.out.printf("%4d%,20.2f%n", year, amount);   
			  continue;
		  case 4:
			  amount = principal * Math.pow(1.0 + rate4, year);
			  System.out.printf("%4d%,20.2f%n", year, amount);   
			  continue;
		  case 5:
			  amount = principal * Math.pow(1.0 + rate5, year);
			  System.out.printf("%4d%,20.2f%n", year, amount);   
			  continue;
		  case 6:
			  amount = principal * Math.pow(1.0 + rate6, year);
			  System.out.printf("%4d%,20.2f%n", year, amount);   
			  continue;
		  
		  }
	  }
      
                                                             
      // display the year and the amount                     
    //  System.out.printf("%4d%,20.2f%n", year, amount);       
   }                                                         
} 
} 
