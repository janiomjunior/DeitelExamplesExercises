import java.security.SecureRandom;

//import Craps.Status;

public class exercise_718_game_of_craps {
	
	// create secure random number generator for use in method rollDice
	   private static final SecureRandom randomNumbers = new SecureRandom();

	   // enum type with constants that represent the game status
	   private enum Status {CONTINUE, WON, LOST};                

	   // constants that represent common rolls of the dice
	   private static final int SNAKE_EYES = 2;
	   private static final int TREY = 3;      
	   private static final int SEVEN = 7;     
	   private static final int YO_LEVEN = 11; 
	   private static final int BOX_CARS = 12; 

	   // plays one game of craps
	   public static void main(String[] args) {
	      int myPoint = 0; // point if no win or loss on first roll
	      Status gameStatus; // can contain CONTINUE, WON or LOST

	      int sumOfDice = 0; // first roll of the dice
	      int [] countWin = new int [22];
	      int [] countLoss = new int [22];
	      int roll = 0;
	      int rollSum = 0;

	      // determine game status and point based on first roll
	      for (int i = 0 ; i <=1000; i++) {
	    	  sumOfDice = rollDice();  
	      switch (sumOfDice) {
	         case SEVEN: // win with 7 on first roll    
	         case YO_LEVEN: // win with 11 on first roll
	            gameStatus = Status.WON;
	            ++countWin[1];
	            
	            break;
	         case SNAKE_EYES: // lose with 2 on first roll
	         case TREY: // lose with 3 on first roll      
	         case BOX_CARS: // lose with 12 on first roll 
	            gameStatus = Status.LOST;
	            ++countLoss[1];
	           
	            break;
	         default: // did not win or lose, so remember point  
	            gameStatus = Status.CONTINUE; // game is not over
	            myPoint = sumOfDice; // remember the point       
	            //System.out.printf("Point is %d%n", myPoint);
	            break; 
	      }

	      // while game is not complete
	      while (gameStatus == Status.CONTINUE) { // not WON or LOST
	         sumOfDice = rollDice(); // roll dice again
	         roll += 1; 

	         // determine game status
	         if (sumOfDice == myPoint) { // win by making point
	            gameStatus = Status.WON;
	            if (roll <= 20)
	            	++countWin[roll];
	            else
	            	++countWin[21];
	         } 
	         else { 
	            if (sumOfDice == SEVEN) { // lose by rolling 7 before point
	            	if (roll <=20)
		            	++countLoss[roll];
		            else
		            	++countLoss[21];
	            } 
	         } 
	      } 

	      // display won or lost message
	      if (gameStatus == Status.WON) {
	         //System.out.println("Player wins");
	        // System.out.println("---------");
	    	 rollSum += roll;
	         roll = 0;
	      } 
	      else {
	         //System.out.println("Player loses");
	        // System.out.println("---------");
	    	 //rollSum += roll;
	         roll = 0;
	      } 
	   }
	      System.out.printf ("          ");
	      for (int i = 1; i <= 21; i ++) {
	    	  
	    		  System.out.printf ("R%05d    " ,   i );
	    	
	      }
	      System.out.println();
	      System.out.print("Won       " );
	      int totalWin = 0;
	      int totalLoss = 0;
	      double chances = 0;
	      for (int i = 1; i <= 21; i++) {
	    	  System.out.printf("%06d    ", countWin[i] );
	    	  totalWin += countWin[i];
	    	  
	      }
	      System.out.println();
	      System.out.print("Loss      " );
	      for (int j = 1; j <= 21; j++) {
	    	  System.out.printf("%06d    ", countLoss[j]);
	    	  totalLoss += countLoss[j];
	    	  
	      }
	      System.out.println();
	      System.out.print(" The chance to win in % is: ");
	      chances = (double) totalWin/rollSum;
	      System.out.print(chances*100);
	      
	      System.out.println();
	      System.out.println(" The Average length: ");
	      
	      for (int i = 1; i <= 21 ; i ++) {
	    	  
	    	  System.out.printf("%02f ",(100*(double)(countWin[i]/(totalLoss + totalWin))));
	    	  
	      }
	   }
	/*
	 * int total = 0;
	 * 
	 * // sum grades for one student for (int grade : setOfGrades) { total += grade;
	 * }
	 * 
	 * // return average of grades return (double) total / setOfGrades.length; } }
	 */

	   // roll dice, calculate sum and display results
	   public static int rollDice() {
	      // pick random die values
	      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
	      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

	      int sum = die1 + die2; // sum of die values

	      // display results of this roll
	      //System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

	      return sum; 
	   } 
	} 


