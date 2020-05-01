
public class exercise_710_SalesComission {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] salary = new int [10];
		private String salesPeople;
		private static int [] gross = new int [10];
		
		public exercise_710_SalesComission (String People, int[] gross) {
			this.salesPeople = salesPeople;
			this.gross = gross;
		
			}

	

		public String getSalesPeople() {
			return salesPeople;
		}

		public void setSalesPeople(String salesPeople) {
			this.salesPeople = salesPeople;
		}
		public static void display(int[] gross) {
			int salary[] = new int [9];
			for(int i = 1; i < gross.length ; i++) {
				double comission = 200 + 0.09*gross[i];
				++salary[(int) (comission/100)];
			}
			System.out.println("The comission from salesperson:");
			System.out.println("                    " + "Salary");
			for(int i = 0; i < salary.length; i++ ) {
				System.out.printf("%02d-%02d: ", 
			               200 + i * 100, 200 + i * 100 + 99);
				for (int count = 0; count < salary[i]; count ++) {
					   System.out.print("*");
		         } 

		         System.out.println();
				}
			}
		}


		

	

//}
