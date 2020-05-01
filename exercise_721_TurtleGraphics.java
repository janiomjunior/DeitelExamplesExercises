import java.util.Scanner;

//import TurtleGraphics.Pen;

public class exercise_721_TurtleGraphics {
	// the use of ENUM is due we already know the entire possibilities 
	   private enum Pen{PEN_UP,PEN_DOWN};
	   private enum Turn{TURN_RIGHT,TURN_LEFT};
	   private enum Direction{UP,DOWN,RIGHT,LEFT};
	   
	   int [][] floor;
	   int [] currentPosition;
	   private Direction direction;
	   private Pen pen;
	   //int count = 0;

	public exercise_721_TurtleGraphics(int[] startPosition) {
		// TODO Auto-generated constructor stub
		floor = new int [20][20];
		currentPosition = new int [2];
		currentPosition = startPosition;
		direction = Direction.RIGHT;
		
	}
	public void turtle (String [] comms) {
		
		int count = 0;
		while (count < comms.length) {
			char firstLetter = comms[count].charAt(0);
			int commscode = Character.getNumericValue(firstLetter);
			
			switch (commscode) {
			case 1:
				pen = Pen.PEN_UP;
				break;
			case 2:
				pen = Pen.PEN_DOWN;
				break;
			case 3:
				turn (Turn.TURN_RIGHT);
				break;
			case 4:
				turn (Turn.TURN_LEFT);
				break;
			case 5://convert the subsequent chars in integer defining how it will be formatted.
				String stepString = String.format("%C%C", comms[count].charAt(2), comms[count].charAt(3));
				int stepCount = Integer.parseInt(stepString);
				moveFor(stepCount);
				break;
			case 6:
				display();
				break;
			case 9:
				System.exit(0);
				
			}
			count++;
		}
		
	}
	public void turn (Turn turn) {
		switch(turn) {
		case TURN_RIGHT://it is important to define if the turtle will turn from where (UP, DOWN, LEFT or RIGHT)
			switch(direction) {
			case UP:
				direction = Direction.RIGHT;
				break;
			case DOWN:
				direction = Direction.LEFT;
				break;
			case LEFT:
				direction = Direction.UP;
				break;
			case RIGHT:
				direction = Direction.DOWN;
				break;
				}
			break;
		
			
		case TURN_LEFT://it is important to define if the turtle will turn from where (UP, DOWN, LEFT or RIGHT)
			switch(direction) {
			case UP:
				direction = Direction.LEFT;
				break;
			case DOWN:
				direction = Direction.RIGHT;
				break;
			case LEFT:
				direction = Direction.DOWN;
				break;
			case RIGHT:
				direction = Direction.UP;
				break;
			}
		}
		
	}
	public void moveFor ( int step) {
		
			switch (direction){
				case UP:
					if( currentPosition[0] - step <= floor.length) {// currentPosistion[0] represents rows will change
					for ( int i = 1 ; i <= step ; i++) {
						pen(currentPosition[0] - i, currentPosition[1]);
						
					}
					currentPosition[0] -= step; 
					}else {
                        System.out.printf("Turtle can not move further in %s direction%n",direction);
                    }
					break;
				//case RIGHT:
				case DOWN:
					if( currentPosition[0] + step <= floor.length) {// currentPosistion[0] represents rows will change
						for ( int i = 1 ; i <= step ; i++) {
							pen(currentPosition[0] + i, currentPosition[1]);
						
						}
						currentPosition[0] += step; 
					}else {
                        System.out.printf("Turtle can not move further in %s direction%n",direction);
                    }
					break;
				case RIGHT:
					if( currentPosition[1] + step <= floor.length) {// currentPosistion[1] represents col will change
					for ( int i = 1 ; i <= step ; i++) {
						pen(currentPosition[0], currentPosition[1]+ i);
						
					}
					currentPosition[1] += step; 
					}else {
                        System.out.printf("Turtle can not move further in %s direction%n",direction);
                    }
					break;
				//case RIGHT:
				case LEFT:
					if( currentPosition[1] - step <= floor.length) {// currentPosistion[1] represents col will change
					for ( int i = 1 ; i <= step ; i++) {
						pen(currentPosition[0], currentPosition[1]- i);
						
					}
					currentPosition[1] -= step; 
					}else {
                        System.out.printf("Turtle can not move further in %s direction%n",direction);
                    }
					break;
				//case RIGHT:
		}
		
	}
	   public void pen(int row , int column)
	   {
	         switch (pen)
	         {
	                case PEN_UP: // pen up : do nothing
	                break;
	                case PEN_DOWN:   // pen down : set appropriate floor elements to 1s.
	                floor[row][column] = 1;
	                break;
	         }
	   }
	   public void display() {
		   
		   for ( int i = 0; i < floor.length ; i++) {
			   for (int j = 0; j < floor[i].length; j++ ) {
				   {
                       if (floor[i][j] == 1)
                       System.out.print("*");
                       else
                       System.out.print(" ");
				   }
              
			   }
			   System.out.println();
		   }
	         
	   }
}

