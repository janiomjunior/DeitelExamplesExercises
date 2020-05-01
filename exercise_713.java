
public class exercise_713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] sales =  {{1,1,1,1,1},
						 {2,2,2,2,2},
						 {3,3,3,3,3}};
		
		
		for (int row = 0; row < sales.length; row++) {
			System.out.println();
			for (int col = 0; col < sales[row].length; col++) {
				sales[row][col] = 0;
				System.out.print(sales[row][col]);
				
			}
			
		}

	}

}
