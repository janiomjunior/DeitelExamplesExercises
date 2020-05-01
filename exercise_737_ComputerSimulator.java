import java.util.Scanner;

public class exercise_737_ComputerSimulator {
	
	static int  accumulator;
	static int memoryPointer = 0;
	static int instructionCounter = 0;
	static int instructionRegister;
	static int operationCode = 0;
	static int operand = 0;
	static boolean itsHalt = false;
	static int [] memory = new int [100];
	final static int READ = 10;
	final static int WRITE = 11;
	final static int LOAD = 20;
	final static int STORE = 21;
	final static int ADD = 30;
	final static int SUBTRACT = 31;
	final static int DIVIDE = 32;
	final static int MULTIPLY = 33;
	final static int BRANCH = 40;
	final static int BRANCHNEG = 41;
	final static int BRANCHZERO = 42;
	final static int HALT = 43;
	//String information;
	
	
	public static void main(String[] args) {
		int word;
		Scanner input = new Scanner (System.in);
		welcomeMessage();
		//int memoryPointer = 0;
		do {
			System.out.printf("%02d ? ", memoryPointer);
			//System.out.print("ENTER 5-digit instruction : ");
			word = input.nextInt();
			if (checkNumber(word) && word != -99999) { 
				memory[memoryPointer] = word;
				memoryPointer++;
			}else {
				System.out.println("RE_ENTER the number: ");
				//word = input.nextInt();
				
			}
			
			
		}while (word != -99999);
		
		System.out.println("*** Program loading completed ***");
		System.out.println("*** Program execution begins ***");

		loadMemory(memory, memoryPointer-2);
	}
	public static boolean checkNumber (int word) {
		if(word >= -9999 && word <= 9999) {
			return true;
		}else
			return false;
	}


	public static void welcomeMessage () {
		System.out.println("***            Welcome to Simpletron!           ***");
		System.out.println("*** Please enter your program, one instruction  ***");
		System.out.println("*** (or data word) at a time. I will display    ***");
		System.out.println("*** the location number and a question mark (?) ***");
		System.out.println("*** You then type the word for that location.   ***");
		System.out.println("*** Type -99999 to stop entering your program.  ***");

	}

	public static void loadMemory (int [] memory, int memoryPointer) {
		
		while (instructionCounter <= memoryPointer && itsHalt == false) {
			whatToDo (memory[instructionCounter]);
			instructionCounter++;
		}
		dump();
	}
	public static void whatToDo (int instructionRegister) {
		exercise_737_ComputerSimulator.instructionRegister = instructionRegister;
	//	int operationCode = 0;
	//	int operand = 0;
		exercise_737_ComputerSimulator.operationCode = instructionRegister / 100;
		exercise_737_ComputerSimulator.operand = instructionRegister % 100;
		
		switch(operationCode){
		case 0:
			break;
		case READ:
			int word;
			Scanner input = new Scanner(System.in);
			System.out.print(" Enter a integer: ");
			word = input.nextInt();
			memory[operand] = word;
			break;
		case WRITE:
			System.out.println("The word is: " + memory[operand]);
			break;
		case LOAD: 
			accumulator = memory[operand];
			break;
		case STORE:
			memory[operand] = accumulator;
			break;
		case ADD:
			accumulator += memory[operand];
			if (accumulator > 9999 || accumulator < -9999) {
				System.out.print(" Accumulator Overflows");
				System.out.print("*** Simpletron execution abnormally terminated");
				System.exit(0);
				
			}
			break;
		case SUBTRACT:
			accumulator -= memory[operand];
			break;
		case DIVIDE:
			if(memory[operand]==0 ) {
				System.out.print("*** Attempt to divide by zero ***");
				System.out.print("*** Simpletron execution abnormally terminated");
				System.exit(0);
			}
			accumulator /= memory[operand];
			
			break;
		case MULTIPLY:
			accumulator *= memory[operand];
			break;
		case BRANCH:
			instructionCounter = operand;
			break;
		case BRANCHNEG:
			if(accumulator < 0) {
				instructionCounter = operand;
			}
			break;
		case BRANCHZERO:
			if(accumulator == 0) {
				instructionCounter = operand;
			}
			break;
		case HALT:
			System.out.println("*** Simpletron execution terminated ***");
			dump();
			itsHalt = true;
			break;
		}

	}
	public static void dump () {
		System.out.println("             *** REGISTERS: ***              ");
		System.out.printf("           accumulator %04d%n" , accumulator);
		System.out.printf("           instructionCounter %04d%n", instructionCounter);
		System.out.printf("           instructionRegister %04d%n", instructionRegister);
		System.out.printf("           operationCode %04d%n", operationCode);
		System.out.printf("           operand %04d%n" , operand);
		System.out.println();
		System.out.println();
		System.out.println("           Memory");
		System.out.println();
		System.out.println();
		System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		for ( int i = 0; i < memory.length; i++) {
			if(i == 0) {
				System.out.print("00   "); 
				System.out.printf(" +%04d", memory[0]);
				//System.out.print("  ");
				//System.out.printf("  %04d", memory[i]);
			}else if (i % 10 == 0) {
				System.out.println();
				System.out.print(i + "   ");
				System.out.printf(" +%04d", memory[i]);
			} else
				System.out.printf("   +%04d", memory[i]);
	}
		System.exit(0);
}
	
	
}
//System.out.printf("%02d-%02d: ", 
//        200 + i * 100, 200 + i * 100 + 99);