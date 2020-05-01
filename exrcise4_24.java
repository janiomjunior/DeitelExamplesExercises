


	//public static void main(String[] args) {
		  // Fig. 4.12: Analysis.java 
		  // Analysis of examination results using nested control statements. 
		  import java.util.Scanner; // class uses class Scanner 
		 
		  public class exrcise4_24 { 
		     public static void main(String[] args) { 
		        // create Scanner to obtain input from command window 
		        Scanner input = new Scanner(System.in); 
		  
		       // initializing variables in declarations
		       int passes = 0;
		       int failures = 0;
		       //int studentCounter = 1;
		       int result = 0;
		 
		       
		       while ((result != 1) && (result != 2)) { 
		          // prompt user for input and obtain value from user 
		          System.out.print("Enter result (3 = pass, 4 = fail): "); 
		          result = input.nextInt(); 
		 
		          // if …else is nested in the while statement
		          if (result == 3) {
		             passes = passes + 1;
		          }  
		          else {
		             failures = failures + 1;
		          }
		 
		          // increment studentCounter so loop eventually terminates 
		          //studentCounter = studentCounter + 1;  
		       } 
		 
		       // termination phase; prepare and display results 
		       System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		 
		       // determine whether more than 8 students passed
		       if (passes > 8) {
		          System.out.println("Bonus to instructor!");
		       }
		    } 
		 }
		
