import java.util.Scanner;

public class exercise_628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int number;
		do {
			System.out.print("Enter a rating :");
			 number = in.nextInt();
			 qualityPoints(number);
		}while ( number >= 60 && number <= 100);
	}
	static void qualityPoints (int number) {
		if (number >= 60 && number <= 100) {
			int result = number/10;
				switch (result) {
					case 10: case 9:
						System.out.println(4);
						break;
					case 8:
						System.out.println(3);
						break;
					case 7:
						System.out.println(2);
						break;
					case 6:
						System.out.println(1);
						break;
			
			}
			
		}
	}

}
