
public class exponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("A potencia é: %n%f" , integerPower(3,5));
	}
static double integerPower( double base, double expoent) {
	double result = 1;
	for(int i = 1; i<=expoent; i++) {
		
		  result = result * base;
	}
	
	return result;
}
}
