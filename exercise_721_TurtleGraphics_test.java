
public class exercise_721_TurtleGraphics_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("-------------------------------");
		System.out.println("Command              Meaning   ");
		System.out.println();
		System.out.println("   1                  Pen Up   ");
		System.out.println();
		System.out.println("   2                 Pen Down  ");
		System.out.println();
		System.out.println("   3                Turn Right ");
		System.out.println();
		System.out.println("   4                 Turn Left ");
		System.out.println();
		System.out.println("  5,12              Move For12 ");
		System.out.println();
		System.out.println("   6          Display 20-by-20 ");
		System.out.println();
		System.out.println("   9               End of data ");
		System.out.println("-------------------------------");
		
		int [] startPosition = {0,0};
		String[] array = {"2","5,19","3","5,19","3","5,19","3","5,19","1","6","9"};
		
		exercise_721_TurtleGraphics turtle = new  exercise_721_TurtleGraphics (startPosition);
		turtle.turtle(array);
	}

}
