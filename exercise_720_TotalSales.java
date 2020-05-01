
public class exercise_720_TotalSales {
	
	//int salesNumber;
	//int prodNumber;
	//int dolProduct;
	
	static int [][] salesTable = new int [5][4];
	static int totalCol = 0;
	static int totalRow = 0;
	
	//public exercise_720_TotalSales(int salesNumber, int prodNumber, int dolProduct) {
	//	super();
	//	this.salesNumber = salesNumber;
	//	this.prodNumber = prodNumber;
	//	this.dolProduct = dolProduct;
	

	//public static void main(String[] args) {
		
	//}
	public static void table(int sales, int pNumber, int totalSales) {
		salesTable [sales][pNumber] += totalSales;
		
	}
	public static void output() {
		for(int i = 1; i <= 4; i++) {
			System.out.print("            " + "Sales " + i);
			
		}
		System.out.print("            TOTAL");
		System.out.println();
		for(int i = 0; i < salesTable.length; i++) {
			totalCol = 0;
			System.out.printf("%nProduct  " + (i+1));
			
			for(int j = 0; j < salesTable[i].length; j++) {
				System.out.printf("  %06d           " , salesTable[i][j]);
				totalCol += salesTable[i][j];
				if(j == 3) {
					System.out.printf("   %06d        " , totalCol);
				}
			}
			if (i == 4) {
				System.out.println();
				System.out.print("TOTAL       ");
			}
		}for(int j = 0; j <= 3; j++) {
			totalRow = 0;
			for ( int i = 0; i <= 4; i++) {
				totalRow += salesTable[i][j];
			}
			System.out.printf("%06d             " ,totalRow);
		}
		//for()
		
	}
	

}

