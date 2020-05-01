//import java.util.ArrayList;
//import java.util.Collections;

public class exercise_722_v2 {

	static int [][] board = new int [4][4];
	static int [][] accessibility = {{2,3,4,4,4,4,3,2},
									 {3,4,6,6,6,6,4,3},
									 {4,6,8,8,8,8,6,4},
									 {4,6,8,8,8,8,6,4},
									 {4,6,8,8,8,8,6,4},
									 {4,6,8,8,8,8,6,4},
									 {3,4,6,6,6,6,4,3},
									 {2,3,4,4,4,4,3,2}};
	//static ArrayList<Integer> tieList = new ArrayList<Integer>();
	static int currentRow = 0 ;
	static int currentCol = 0;
	static int [] horizontal = {2,1,-1,-2,-2,-1,1,2};
	static int [] vertical = {-1,-2,-2,-1,1,2,2,1};
	static int moveCount;
	
	public static void main(String[] args) {
		
		board[0][1] = -1;
		if(solveProblem(board, 0, 1, 1 )) {
			display();
		}else {
			System.out.println("No solution");
		}
		
		
		
		
	}
	
	public static boolean solveProblem(int [][] board, int currentRow, int currentCol, int moveCount) {
		if(moveCount > 16) {
			return true;
		}
		for ( int i = 0; i <= 7; i++) {
			int nextX = currentRow + vertical[i];
			int nextY = currentCol + horizontal[i];
			
			if(IsSafeMove(nextX, nextY) && board[nextX][nextY] == 0) {
				board[nextX][nextY] = moveCount;
				//display();
				
				if(solveProblem(board, nextX, nextY, moveCount + 1)) {
					return true;
				}
				board[nextX][nextY] = 0;
			}else {
				display();
				System.out.println(" ");
				System.out.println("the moves are: " + moveCount);
			}
	}
		return false;
	}
	public static boolean IsSafeMove( int nextX, int nextY) {
		if(nextX < 0 || nextX > 3 || nextY < 0 || nextY > 3 ) {
			return false;
		}else {
			return true;
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
		                            	if (board[row][column] / 10 >= 1 || board[row][column]== -1 )
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



