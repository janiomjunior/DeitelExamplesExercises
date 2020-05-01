
public class exercise_627 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			gcd(1220, 516);
	}
static void gcd (int a, int b) {
	int remainder;
	//int quotient;

	do {
		//quotient = a/b;
		remainder = a % b;
		if (remainder != 0) {
			a = b; 
			b = remainder;
		}
			
		
	}while (remainder != 0);
	System.out.print(b);
}
}

