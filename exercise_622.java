import java.util.Scanner;

public class exercise_622 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Temperatura de 140 Fahrenheit is: " + celsius(140));
		System.out.println("Temperatura de 40 Celsisus is: " + fahrenheit(70));
	
	}
	
	static double celsius (double fahrenheit) {
		
		double cel = 5.0/9.0*(fahrenheit - 32);
		
		return cel;
		
	}
	
	static double fahrenheit (double cel) {
		
		double fah = 9.0/5.0*cel + 32;
		
		return fah;
	}
}
