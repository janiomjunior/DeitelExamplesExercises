//* Exercise 7.22: Knight's Tour
// * See page 345
// */

//package exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise_722 {

private static int[][] chessBoard = new int[8][8];
private static int currentRow;
private static int currentColumn;
private final static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
private final static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
private final static Random randomNumbers = new Random();
//private final static Scanner input = new Scanner(System.in);
private static int counter;

public static void main(String[] args) {
    for(int row = 0; row < chessBoard.length; row++) {
        for(int col = 0; col < chessBoard[row].length; col++) {
            chessBoard = new int[8][8];
            currentRow = row;
            currentColumn = col;
            System.out.printf("Starting at %dx-%dy.%n", currentRow, currentColumn);
            int[][] accessability =
                {{2, 3, 4, 4, 4, 4, 3, 2},
                 {3, 4, 6, 6, 6, 6, 4, 3},
                 {4, 6, 8, 8, 8, 8, 6, 4},
                 {4, 6, 8, 8, 8, 8, 6, 4},
                 {4, 6, 8, 8, 8, 8, 6, 4},
                 {4, 6, 8, 8, 8, 8, 6, 4},
                 {3, 4, 6, 6, 6, 6, 4, 3},
                 {2, 3, 4, 4, 4, 4, 3, 2}};
            counter = 0;
            int min;
            ArrayList<Integer> surroundings = new ArrayList<>();

            do {
                surroundings.clear();
                min = 8;
                /* In case of finding a tile accessible by less spaces than the last least accessible tile, set it as the new
                 * least accessible tile but also alter the ArrayList accordingly. 
                 * In case of finding a tile as accessible as the current least accessible one, just add it to the list.
                 */
                for(int i = 0; i < 8; i++) {
                    if(canMove(i, false) && accessability[currentRow + vertical[i]][currentColumn + horizontal[i]] >= 0) {
                        if(accessability[currentRow + vertical[i]][currentColumn + horizontal[i]] < min) {
                            surroundings.clear();
                            min = accessability[currentRow + vertical[i]][currentColumn + horizontal[i]];
                            surroundings.add(i);
                        } else if(accessability[currentRow + vertical[i]][currentColumn + horizontal[i]] == min)
                            surroundings.add(i);        
                    }
                }
                if(surroundings.size() > 0) {
                    move(moveWhere(surroundings), accessability);
                    //drawBoard(accessability);
//                      try {
//                          Thread.sleep(1000);
//                      }catch (Exception e) {
//                          // TODO: handle exception
//                      }
                }
            } while(surroundings.size() > 0);
            drawBoard(chessBoard);
            System.out.println(counter);
        }
    }
//      System.out.print("Please enter a direction to move: ");
//      while(input.hasNext()) {
//          counter++;
//          int direction = input.nextInt();
//          while(!move(direction)) {
//              System.out.print("Please try moving somewhere else: ");
//              direction = input.nextInt();
//          }
//          drawBoard();
//          System.out.print("Please enter a new direction to move: ");
//      }
//      System.out.println(counter);

}
/* Method canMove determines
 * a) whether the knight moves within the confines of the board and if the next tile hasn't been occupied earlier.
 * b) in case where one is altering the accessibility matrix, simply if the knight is moving within the board.
 */
public static boolean canMove(int number, boolean accessability) {
    if(currentRow + vertical[number] < chessBoard.length 
            && currentRow + vertical[number] >= 0
            && currentColumn + horizontal[number] < chessBoard[currentColumn].length
            && currentColumn + horizontal[number] >= 0) {
        if(!accessability && chessBoard[currentRow + vertical[number]][currentColumn + horizontal[number]] == 0)
            return true;
        else if(accessability)
            return true;
    } 
        //System.out.printf("Could not move Knight to %dx-%dy.%n", 
        //      currentRow + vertical[number], currentColumn + horizontal[number]);
        return false;
}

/* After having made a successful call to canMove and having determined, in case of a tie,
 * which move to perform, the knight is moved to it's new location, at which point the accessibility
 * matrix is also altered. 
 */
public static void move(int number, int[][] accessability) {
    //System.out.printf("Knight moving from %dx-%dy ", currentColumn, currentRow);
    currentRow += vertical[number];
    currentColumn += horizontal[number];
    accessability[currentRow][currentColumn] = -1;
    alterAccessability(accessability);
    chessBoard[currentRow][currentColumn] = ++counter;
    //System.out.printf("to %dx-%dy.%n", currentColumn, currentRow);
}

/* In case of a tie amongst several tiles (due to the accessibility heuristics) the 
 * program chooses a move at random.
 */
public static int moveWhere(ArrayList<Integer> surroundings) {
    return surroundings.get(randomNumbers.nextInt(surroundings.size()));
}

/* This method alters the correct tiles around the knight's current position
 * after a call to canMove().
 */
public static void alterAccessability(int[][] accessability) {
    for(int i = 0; i < 8; i++) {
        if(canMove(i, true) && accessability[currentRow + vertical[i]][currentColumn + horizontal[i]] > 0) {
            accessability[currentRow + vertical[i]][currentColumn + horizontal[i]]--;
        }               
    }
}

public static void drawBoard(int[][] board) {
    for(int row = 0; row < board.length; row++) {
        for(int col = 0; col < board[row].length; col++) {
            if(row == currentRow && col == currentColumn)
                System.out.print(" K  ");
            else
                System.out.printf(" %02d ", board[row][col]);
        }
        System.out.println();
    }
    System.out.println();
}
}