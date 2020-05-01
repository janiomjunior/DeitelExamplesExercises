import java.util.Scanner;

public class exercise7511 {

	public static void main(String[] args) {
		
		int quantity;
		int number=0;
		int smallest = 100;
		int i;
		Scanner input = new Scanner(System.in);
		System.out.print("Qunatity numbers: ");
		quantity = input.nextInt();
		
		for ( i = 1; i<= quantity ; i++ ) {
			System.out.print("100 < Number : ");
			number = input.nextInt();
			if(number < smallest)
				smallest = number;
							
		}
		System.out.print(smallest);
	}

}
