
public class exercise_720_TotalSales_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//exercise_720_TotalSales sales1 = new exercise_720_TotalSales();
		//exercise_720_TotalSales sales2 = new exercise_720_TotalSales();
		//exercise_720_TotalSales sales3 = new exercise_720_TotalSales();
		//exercise_720_TotalSales sales4 = new exercise_720_TotalSales();
		//exercise_720_TotalSales sales = new exercise_720_TotalSales(2,2,50);
		//exercise_720_TotalSales sales1 = new exercise_720_TotalSales(1,1,40);
		//exercise_720_TotalSales sales1 = new exercise_720_TotalSales(1,1,10);
		//exercise_720_TotalSales sales1 = new exercise_720_TotalSales(1,1,10);
		//exercise_720_TotalSales sales1 = new exercise_720_TotalSales(1,1,10);
		//exercise_720_TotalSales sales1 = new exercise_720_TotalSales(1,1,10);
		//exercise_720_TotalSales sales1 = new exercise_720_TotalSales(1,1,10);
		
		for(int i = 0 ; i < 5; i++ ) {
			for(int j = 0; j <= i; j++) {
				if(j != 4) {
				exercise_720_TotalSales.table(i, j, ((i + j + 1)*10*(j+10)));
				exercise_720_TotalSales.table(i, j, ((i + j + 1)*10*(j+i+10)));
				exercise_720_TotalSales.table(i, j, ((i + j + 1)*10*(j+2)*(i+2)));
				exercise_720_TotalSales.table(i, j, ((i + j + 1)*10*(j+i+5)));
			}
		}
		}
		exercise_720_TotalSales.output();
		//sales1.table(1, 1, 10);
		//sales1.table(1, 2, 23);
		//sales1.table(1, 4, 13);
		//sales2.table(2, 1, 100);
		//sales2.table(2, 2, 25);
		//sales2.table(2, 4, 40);
		
	}

}
