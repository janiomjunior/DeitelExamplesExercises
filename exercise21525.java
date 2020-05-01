import java.util.Scanner;

public class exercise21525 {

	public static void main(String[] args) {
		int row;
		int column;
		int odd;
		int limit;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter with Odd number from 1-19; ");
		odd = input.nextInt();
		
		for (row =1 ; row <= odd ; row+=2) {
			
			for (column = 1; column <= row ; column++)
				System.out.print('*');
			
			for (int space = 10; space >= row; space--)
				System.out.print(' ');
			
			System.out.println();
				
		}
		limit = odd - 2;
		for (row = limit ; row >= 1 ; row-=2) {
			
			for (column = 1; column <= row ; column++)
				System.out.print('*');
			
			for (int space = 10; space >= row; space--)
				System.out.print(' ');
			
			System.out.println();
				
		}
		

	}

}
