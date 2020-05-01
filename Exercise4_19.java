import java.util.Scanner;

public class Exercise4_19 {

	public static void main(String[] args) {
		
		int quantItemSold;
		int item;
		double percentage1 = 0, percentage2 = 0, percentage3 = 0, percentage4 = 0;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Quantity itens sold: ");
		quantItemSold = input.nextInt();
		
		for (int i=1 ; i <= quantItemSold ; i++) {
			System.out.println("itens ("+ i + ") was sold? (1);(2);(3);(4): ");
			item = input.nextInt();
			if(item == 1) {
				percentage1 = 239.99 * 0.09;
			}else if(item == 2) {
				percentage2 = 129.75 * 0.09;
			}else if(item == 3) {
				percentage3 = 99.95 * 0.09;
			}else if(item == 4) {
				percentage4 = 350.89 * 0.09;
			}
			//double total = 200 + percentage1 + percentage2 + percentage3 + percentage4; 
		}
		double total = 200 + percentage1 + percentage2 + percentage3 + percentage4; 
		System.out.println("Salesperson's Earnings: " + total );
	}

}
