import java.util.Scanner;

public class exercise_6_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int radius;
		Scanner input = new Scanner(System.in);
		System.out.print("Radius: ");
		double radius = input.nextDouble(); 
	
		System.out.printf("Volume is %f%n", sphereVolume(radius));
	}
		private static double sphereVolume (double radius) {
			double volume = (4.0/3.0) * Math.PI * Math.pow(radius,  3);
					//System.out.printf("Volume is: ", volume);
			return volume;
		}
}
		
		//sphereVolume(10);
	


