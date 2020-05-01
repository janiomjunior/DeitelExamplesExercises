
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
//import java.util.Collection;
import java.util.Collections;

public class exercise_723b {
	
	static int [][] board = new int [8][8];
	static int [][] accessibility = {{2,3,4,4,4,4,3,2},
									 {3,4,6,6,6,6,4,3},
									 {4,6,8,8,8,8,6,4},
									 {4,6,8,8,8,8,6,4},
									 {4,6,8,8,8,8,6,4},
									 {4,6,8,8,8,8,6,4},
									 {3,4,6,6,6,6,4,3},
									 {2,3,4,4,4,4,3,2}};
	//static ArrayList<Integer> tieList = new ArrayList<Integer>();
	static int currentRow ;
	static int currentCol ;
	
	static int [] horizontal = {2,1,-1,-2,-2,-1,1,2};
	static int [] vertical = {-1,-2,-2,-1,1,2,2,1};
	
	static ArrayList<Integer> heuristics = new ArrayList<Integer>();
	static int[] heuristicsCheck = {10,10,10,10,10,10,10,10};
	
	static int con = 10;
	
	static int countLP = 0;
	static int count = 1;
	static int min ;
	static boolean flag = false;
	static int randomStep;
	
	static SecureRandom Random = new SecureRandom();
	
	public static void main(String[] args) {

    
	int fullTour = 0;
	//int test = 1;
	//int sum;

	int countTour = 1;
	ArrayList<Integer> numberTour = new ArrayList<Integer>();
	do {
				countLP = 0;
				currentRow = 4;
				currentCol = 4;
				board[currentRow][currentCol]  = -1; 
				refHeuri(currentRow, currentCol);
				solveKnight(heuristics, currentRow, currentCol);
				//count = 1 ;
				//display();
				//System.out.println("ROW: " + currentRow+ " Column: " + currentCol);
				//System.out.println("The Count is : " + countLP);
    
				board = new int[8][8];
				
				numberTour.add(countLP);
				countTour++;
				heuristics.clear();
				count = 0;
				//if(countLP == 63) {
				//	fullTour++;
				//}
				//countLP = 1;
	} while (countLP < 63 );
	
	for(int i = 0; i < numberTour.size(); i++) {
		if (i%50 == 0 ) {
			System.out.println();
		}
		System.out.print(" " + numberTour.get(i) + " ");
	}
	System.out.println();
	//System.out.println("The best result was: " + Collections.max(numberTour));
	//System.out.println("Total Full Tour was: " + fullTour);
	System.out.println("The program made: " + countTour + "before reach a full tour");
	}
	public static void solveKnight ( ArrayList<Integer> heuristics, int cR, int cC ) {
		int i = 0;
		int sum = 0;
		min = Collections.min(heuristics);
		do {
		while (flag == false && i <= 7) {
			if (heuristics.get(i) == min && flag == false && min != 10) {
				//	heuristicValue = accessibility[currentRow + horizontal[i]][currentCol + vertical[i]];
				if(currentRow + vertical[i] < board.length && 
						currentRow + vertical[i] >= 0 &&
						currentCol + horizontal[i] < board[0].length && 
						currentCol + horizontal[i] >= 0 && 
						board[currentRow + vertical[i]][currentCol + horizontal[i]]== 0){
					countLP++;
					board[currentRow + vertical[i]][currentCol + horizontal[i]] = countLP;
					currentRow += vertical[i];
					currentCol += horizontal[i];
					//countLP++;
					flag = true;
					//display();
				}else {
					heuristics.remove(i);
					heuristics.add(i,con);
					//ItCanMove();
					min = Collections.min(heuristics);
					i = -1;
				}
			} 
		
			i++;
		}
		
		i = 0;
		heuristics.clear();
		refHeuri(currentRow, currentCol);
		min = Collections.min(heuristics);
		flag = false;
		count++;
		//display();
	}while(count < 64);
	}
		
	
	
	  public static ArrayList<Integer> refHeuri (int currentRow, int currentCol) {
	
		int moveNumber;
		for ( moveNumber = 0; moveNumber <= 7 ; moveNumber++) {

			if(ItCanMove() >= 0) {
				
				heuristics.add(accessibility[currentRow + vertical[randomStep]][currentCol + horizontal[randomStep]]);
				//hIndex.add(moveNumber);
			}else {
				heuristics.add(con);
				}
			}
		return heuristics;
	  }
	  public static int ItCanMove () {
		   randomStep = Random.nextInt(7);
		  if(currentRow + vertical[randomStep] < board.length && currentRow + vertical[randomStep] >= 0 &&
			 currentCol + horizontal[randomStep] < board[0].length && currentCol + horizontal[randomStep] >= 0){
			  return randomStep;
		  }else {
			  return randomStep = -1;
		  }
	  }
		
	   public static void display()
	   {
	          System.out.println();
	          for (int row = 0 ; row < board.length ; row++)
	          {
	                   for (int column = 0 ; column < board[row].length ; column++)
	                   {
	                            if (board[row][column] != 0) {
	                            	if (board[row][column] / 10 >= 1 || board[row][column] == -1 )
	                            		System.out.print(" " + board[row][column]);
	                            	else
	                            		System.out.print(" " + board[row][column] + " ");
	                            }else
	    	                         System.out.print(" 0 ");
	                            
	                            //System.out.print("  " + board[row][column] + "  ");
	                            
	                	   }
	                   
	                   System.out.println();
	                   
	                   
	          }
	   }
}
