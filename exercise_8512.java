
public class exercise_8512 {

	public static void main(String[] args) {
		
		int i;
		int product=1;
		
		for(i = 1; i <= 15; i+=2) {
			
			product *= i; 
		}
		System.out.print(" Odd product is: " + product);
	}

}
