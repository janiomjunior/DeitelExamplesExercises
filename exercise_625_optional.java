
public class exercise_625_optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime(4);
	}
	public static boolean isPrime(int number) {

	    if (number <= 1) {
	        System.out.println("Only positive numbers above 1 can be prime.");
	        return false;
	    }

	    double limit = Math.sqrt(number);

	    for (int i = 2; i <= limit; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}
}
