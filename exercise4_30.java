import java.util.Scanner;

public class exercise4_30 {

	public static void main(String[] args) {
		
		int size;
		int row=1;
		int column;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the square size: ");
		size = input.nextInt();
		while(row <= size ) {
			System.out.println();
			column=1;
			
			while(column <= size) {
				//System.out.print(" r "+ row + " c " + column);
				if((row == 1 || row == size))	{
					System.out.print(" * ");
				
				}else if (column == 1 || column == size ){
					System.out.print(" * ");
				}else
					System.out.print("   ");
				++column;			
			}	
			++row;
		}
		
	}
	}


