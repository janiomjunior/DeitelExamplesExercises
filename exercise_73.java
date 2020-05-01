
public class exercise_73 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 10;
		double [] array = new double[ARRAY_SIZE];
		double total = 0;
		for(int x = 0 ; x < array.length ; x++) {
			if(x == 9) {
				array[x] = 1.667;
			}else if (x == 6) {
				array[x] = 3.333;
			}
			System.out.println(array[x]);
			total += array[x];
		}
		System.out.println(total);

	}

}
