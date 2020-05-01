
public class exercise_624 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPerfect(8128);
	}
static void isPerfect ( int number) {
	int aux;
	int count = 0;
	for (int i = 1; i <= number ; i++) {
		//System.out.println();
		count = 0;
	for( int j = 1; j < i ; j++) {
		 aux = i % j;
		 if (aux == 0) {
			 
			 count+=j;
			 
			 System.out.println(j);
			 
			 //int factor1 = i
		 }
	}
	if (i == count) {
		System.out.println();
		System.out.println("The number is perfect :" + i);
		System.out.println();
	}else {
		System.out.println();
	System.out.println("The number is not perfect " + i);
	}
	System.out.println();
	}
	

}
}
