import java.util.Scanner;

public class exercise_736_SML {
	
	int  accumulator;
	int [] memory = new int [100];
	final int READ = 10;
	final int WRITE = 11;
	final int LOAD = 20;
	final int STORE = 21;
	final int ADD = 30;
	final int SUBTRACT = 31;
	final int DIVIDE = 32;
	final int MULTIPLY = 33;
	final int BRANCH = 40;
	final int BRANCHNEG = 41;
	final int BRANCHZERO = 42;
	final int HALT = 43;
	//String information;
	
	
public exercise_736_SML() {
		// TODO Auto-generated constructor stub
	}


//public exercise_736_SML (String [] information) {
//	this.accumulator = information;
//}
public void putInfo (int [] information) {
	int count;
	for ( count = 0; count < information.length ; count++) {
		memory [count] = information [count];
	}
	loadMemory(memory, count-1);
}
public void loadMemory (int [] accumulator, int icount) {
	for (int i = 0; i <= icount ; i++) {
		whatToDo (memory[i]);
	}
}
public void whatToDo ( int instruction) {
	//String instString;
	//String memString;
	int opCode;
	int mCode;
	opCode = instruction / 100;
	mCode = instruction % 100;
	Scanner input = new Scanner(System.in);
	//int auxInt;
	//String auxString;
	//for (int count = 1; count <= 5; count++) {
		//instString = String.format("%C%C", instruction.charAt(1), instruction.charAt(2));
		//memString = String.format("%C%C", instruction.charAt(3), instruction.charAt(4));
		//opCode = Integer.parseInt(instString);
		//mCode = Integer.parseInt(memString);
		switch(opCode){
			case 0:
				break;
			case READ:
				int word;
				input = new Scanner(System.in);
				System.out.println(" ENTER A number: ");
				word = input.nextInt();
				memory[mCode] = word;
				break;
			case WRITE:
				System.out.println("The word is: " + memory[mCode]);
				break;
			//case 12:
			//	accumulator = 0;
			//	int number = 0;
			//	while (number != -1) {
			//		System.out.println(" ENTER A number or -1 to exit: ");
			//		number = input.nextInt();
			//		memory[mCode] = number;
			//	}
			case LOAD: 
				accumulator = memory[mCode];
				break;
			case STORE:
				//auxString = String.
				memory[mCode] = accumulator;
				break;
			case ADD:
				accumulator += memory[mCode];
				break;
			case SUBTRACT:
				accumulator -= memory[mCode];
				break;
			case DIVIDE:
				accumulator /= memory[mCode];
				break;
			case MULTIPLY:
				accumulator *= memory[mCode];
				break;
			case BRANCH:
				//memString = String.format("%C%C%C%C%C", memory[mCode].charAt(3), memory[mCode].charAt(4));
				//mCode = Integer.parseInt(memString);
				whatToDo (memory[mCode]);
				break;
			case BRANCHNEG:
				if(accumulator < 0) {
					whatToDo (memory[mCode]);
				}
				break;
			case BRANCHZERO:
				if(accumulator == 0) {
					whatToDo (memory[mCode]);
				}
				break;
			case HALT:
				break;
		}
		
}
}
