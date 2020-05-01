import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class exercise_722_KnightTour_v2 {
	
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
	
	static int con = 10;
	
	static int countLP = 1;
	static int count = 1;
	static int min ;
	static boolean flag = false;
	
	public static void main(String[] args) {

    
	int fullTour = 0;
	int test = 1;

		for (int row = 0; row <= 7; row ++) {
			for (int column = 0 ; column <= 7; column++) {
				currentRow = row;
				currentCol = column;
				board[row][column]  = -1; 
				refHeuri(currentRow, currentCol);
				solveKnight(heuristics, currentRow, currentCol);
				count = 1 ;
				display();
				System.out.println("ROW: " + row + " Column: " + column);
				System.out.println("The Count is : " + countLP);
    
				board = new int[8][8];
	
				if(countLP == 63) {
					fullTour++;
				}
				countLP = 1;
	
		}
	}
		
		
	System.out.println("Total Full Tour was: " + fullTour);
	
	}
	public static void solveKnight ( ArrayList<Integer> heuristics, int cR, int cC ) {
		int i = 0;
		min = Collections.min(heuristics);
		do {
		while (flag == false && i <= 7) {
			if (heuristics.get(i) == min && flag == false && min != 10) {
			//	heuristicValue = accessibility[currentRow + horizontal[i]][currentCol + vertical[i]];
				if(ItCanMove(i) == true && board[currentRow + horizontal[i]][currentCol + vertical[i]]== 0) {
					
					board[currentRow + horizontal[i]][currentCol + vertical[i]] = count;
					currentRow += horizontal[i];
					currentCol += vertical[i];
					countLP = count;
					flag = true;
					//display();
				}else {
					heuristics.remove(i);
					heuristics.add(i,con);
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

			if(ItCanMove(moveNumber)) {
				
				heuristics.add(accessibility[currentRow + horizontal[moveNumber]][currentCol + vertical[moveNumber]]);
				//hIndex.add(moveNumber);
			}else {
				heuristics.add(con);
				}
			}
		return heuristics;
	  }
	  public static boolean ItCanMove (int step) {
		  if(currentRow + horizontal[step] < board.length && currentRow + horizontal[step] >= 0 &&
			 currentCol + vertical[step] < board[0].length && currentCol + vertical[step] >= 0){
			  return true;
		  }else {
			  return false;
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
