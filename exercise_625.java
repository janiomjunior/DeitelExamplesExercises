
public class exercise_625 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime(10000);
	}
static void isPrime(int number) {
	for (int i = 2; i <= number; i++) {
	int count = 0;
	for(int j = 2 ; j <= i ; j++) {
		int remainder = i % j;
		if(remainder == 0) {
			count++;
		}
	
	}
	if ( count == 1) {
		System.out.printf(" %n Number is Prime %d", i );
	}//else
	//	System.out.printf(" %n Number is not Prime %d", i);
	}
}
}
