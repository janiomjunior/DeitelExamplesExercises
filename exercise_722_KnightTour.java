import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class exercise_722_KnightTour {
	
	static int [][] board = new int [8][8];
	static int [][] accessibility = {{2,3,4,4,4,4,3,2},{3,4,6,6,6,6,4,3},{4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},
									 {4,6,8,8,8,8,6,4},{4,6,8,8,8,8,6,4},{3,4,6,6,6,6,4,3},{2,3,4,4,4,4,3,2}};
	//static ArrayList<Integer> tieList = new ArrayList<Integer>();
	static int currentRow ;
	static int currentCol ;
	
	public static void main(String[] args) {

	
	int [] horizontal = {2,1,-1,-2,-2,-1,1,2};
	int [] vertical = {-1,-2,-2,-1,1,2,2,1};
	
	//int [] currentPosition = {3,4};
	int moveNumber;
	//int currentRow ;
	//int currentCol ;
    int countLP = 1;
	int count = 1;
	
	//variables for heuristics
	//int [] heuristics = new int [8];
	//ArrayList<Integer> posMin = new ArrayList<Integer>();
	//ArrayList<Integer> posMIndex = new ArrayList<Integer>();
	int min ;
	ArrayList<Integer> heuristics = new ArrayList<Integer>();
	//ArrayList<Integer> hIndex = new ArrayList<Integer>();
	boolean flag = false;
	int con = 10;
	int fullTour = 0;
	int test = 1;
	//int tour = 1;
	//int countTour = 1;
	//int index;
	
	//while (countTour <= 64) {
		for (int row = 0; row <= 7; row ++) {
			for (int column = 0 ; column <= 7; column++) {
				currentRow = row;
				currentCol = column;
				board[row][column]  = -1; 
	
	
	while (count <= 64) {
		
		//movement horizontal[0] and vertical[0]
		for ( moveNumber = 0; moveNumber <= 7 ; moveNumber++) {

			if(((currentRow + horizontal[moveNumber] < board.length) && (currentRow + horizontal[moveNumber] >= 0))&&((currentCol + vertical[moveNumber] < board[0].length) && (currentCol + vertical[moveNumber] >= 0))){
				
				heuristics.add(accessibility[currentRow + horizontal[moveNumber]][currentCol + vertical[moveNumber]]);
				//hIndex.add(moveNumber);
			}else {
				heuristics.add(con);
			}
				//}
			

		}
		min = Collections.min(heuristics);
		//int heuristicValue = 0;
		int i = 0;
		while (flag == false && i <= 7) {
			if (heuristics.get(i) == min && flag == false && min != 10) {
			//	heuristicValue = accessibility[currentRow + horizontal[i]][currentCol + vertical[i]];
				if(board[currentRow + horizontal[i]][currentCol + vertical[i]]== 0) {
					
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

		heuristics.clear();
		flag = false;
//		if(count == 62) {
//			test++;
//		}
//		if(test == 3) {
//			System.out.println(" ");
//		}
		count++;
	}
	
	count = 1 ;
	display();
	System.out.println("ROW: " + row + " Column: " + column);
    System.out.println("The Count is : " + countLP);
    
	for (int rB = 0; rB <= 7; rB ++) {
		for (int cB = 0 ; cB <= 7; cB++) {
			board[rB][cB] = 0;
			
		}
	}
	
	if(countLP == 64) {
   	 fullTour++;
   }
	countLP = 1;
	//countTour++;
	//if ( countTour == 10) {
	//	System.out.println("The tour is : " + countTour);
	
		}
	}
		
		
	System.out.println("Total Full Tour was: " + fullTour);
	
	}
	
//	public static ArrayList<Integer> tie (ArrayList<Integer> heuristic) {
//		int min = Collections.min(heuristic);
//		//int tie;
		
//		for (int i = 0 ; i < heuristic.size(); i++) {
//			if(heuristic.get(i)==min) {
//				tieList.add(i, heuristic.get(i));
//			}else {
//				tieList.add(10);
//			}
//		}
		
//		return tieList;
		
//	}
	
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
