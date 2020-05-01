
public class exercise_729_FiboSeries {
	
	public static void main(String[] args) {
		
		fibonacci(340_000_000);
		
	}
	public static void fibonacci (int n) {
		int [] array = new int[n + 1];
		int i;
		array [0]=0;
		array [1]=1;
		//System.out.print("0 1");
		for ( i = 2 ; i <= n; i++) {
			array [i] = array[i - 1] + array [ i - 2];
			
			//System.out.print(" " + array[i]);
		}
		System.out.print(array[i-1]);
	}
		

}
