
public class exercise_623 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf(" the minimum value is: %d", minimum3(1, 5, 6));

	}
	
	static int minimum3 (int a, int b, int c) {
		
		int minAB = Math.min(a, b);
		int minAC = Math.min(c, minAB);
		int min = Math.min(minAC, minAB);
		return min; 
	}

}
