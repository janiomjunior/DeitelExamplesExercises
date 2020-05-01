import java.util.Scanner;

public class exercise4_36 {

	public static void main(String[] args) {
		
		int sideA;
		int sideB;
		int sideC;
		
		Scanner in = new Scanner (System.in);
		System.out.print("side A: ");
		sideA =in.nextInt();
		System.out.print("side B: ");
		sideB =in.nextInt();
		System.out.print("side C: ");
		sideC =in.nextInt();
		
		if ((sideA + sideB > sideC) & (sideA + sideC > sideB) & (sideB + sideC > sideA)) {
				System.out.println("Sides represent sides of triangle");
		}else
				System.out.println("Sides not represent sides of triangle");
		

}
}
