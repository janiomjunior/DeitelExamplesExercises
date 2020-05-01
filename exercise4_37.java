import java.util.Scanner;

public class exercise4_37 {

	public static void main(String[] args) {

			
			double sideA;
			double sideB;
			double sideC;
			//int pit;
			double A;
			double B;
			double C;
			
			Scanner in = new Scanner (System.in);
			System.out.print("Leg A: ");
			sideA =in.nextInt();
			System.out.print("Leg B: ");
			sideB =in.nextInt();
			System.out.print("Hypotenuse: ");
			sideC =in.nextInt();
			
			A = sideA*sideA;
			B = sideB*sideB;
			C = sideC*sideC;
			
			if(A+B==C) {
				System.out.print("We have a right triangle");
			}else
				System.out.print("We dont have a right triangle");
	}
}

