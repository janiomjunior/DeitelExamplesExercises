
public class exercise_74 {
	//final int ARRAY_SIZE = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 3;
		int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];
		
		for(int x = 0; x < table.length ; x++) {
			for (int y = 0; y < table[x].length ; y++) {
				table[x][y] = x+y ;
				System.out.print(" " + table[x][y]);
			}
			System.out.println();
		}
	}

}
