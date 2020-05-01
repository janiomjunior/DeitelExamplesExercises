
public class exercise_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i<=100 ; i++) {
		double x = Math.random()*100;
		double number = x + 0.5;
		System.out.printf("Original: %n%f", number);
		double y = Math.floor(x + 0.5);
		System.out.printf("rounded: %n%f", y);
		}
		}
	

}
