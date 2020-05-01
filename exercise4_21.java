import java.util.Scanner;

public class exercise4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int number=0;
		int largest=0;
		
		for(count = 0; count < 5; count++) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Next integer: ");
			number = input.nextInt();
			if(number > largest) {
				largest = number;
			}
		}
		
		System.out.println("The Largest: " + largest);

	}

}
