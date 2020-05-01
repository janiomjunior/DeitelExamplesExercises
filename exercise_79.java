import java.security.SecureRandom;
import java.util.Scanner;

public class exercise_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] t = new int [2][3];
		SecureRandom randomNumbers = new SecureRandom();
		int smallest = 10;
		//Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < t.length ; i++) {
			for (int j = 0; j < t[i].length ; j++){
				//System.out.println("Enter the number in position line " + "[" + i + "]" + " Column " + "[" + j + "]: ");
				t[i][j] = randomNumbers.nextInt(10);
				if(j % 3 == 0 )
					System.out.println();
				System.out.print("   " + t[i][j]);
				if(t[i][j] < smallest)
					smallest = t[i][j];
			}
			
		}
		System.out.println();
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The elements of first row: " + t[1][0] + " " + t[1][1] + " " + t[1][2]);
		System.out.println("The total elements of third column is: " + (t[0][2] + t[1][2]));
		System.out.printf("The grades are: %n%n");
		System.out.printf("               %n");
		
		for(int head = 1; head <= t[0].length ; head++) {
			System.out.print("             " + "Test " + head);
		}
		System.out.println();
		for(int indice = 0; indice < t.length ; indice++) {
			System.out.printf("Indice " + indice + "" );
			for (int grade : t[indice]) {
				System.out.print("         " + grade + "         ");
			}System.out.printf("%n");
			
		}
		//t[0][1]=0;
		//System.out.println();
		//System.out.println();
		//to access all elements in row 1
		//for (int i = 0; i <= t.length ; i++) {
		//	System.out.print("   " + t[0][i]);	
		//}
		//System.out.println();
		//System.out.println();
		//for (int j = 0; j < t.length; j++) {
		//	System.out.println("   " + t[j][2]);
		//}

	}

}
