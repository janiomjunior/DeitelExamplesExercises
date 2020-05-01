import java.util.Scanner;

public class exercise13517 {

	public static void main(String[] args) {
		int number = 0;
		int quantity;
		double product1 = 0;
		double product2 = 0;
		double product3 = 0;
		double product4 = 0;
		double product5 = 0;
		double total = 0;
		
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter with product from 1-5 0r -1 to stop: ");
		do {
			System.out.println("Enter with proctuct from 1-5 0r -1 to stop: ");
			number = input.nextInt();
			switch(number) {
			case 1:
				System.out.println("Quantity sold: ");
				quantity = input.nextInt();
				product1 = product1 + 2.98*quantity;
				continue;
			case 2:
				System.out.println("Quantity sold: ");
				quantity = input.nextInt();
				product2 = product2 + 4.50*quantity;
				continue;	
			case 3:
				System.out.println("Quantity sold: ");
				quantity = input.nextInt();
				product3 = product3 + 9.98*quantity;
				continue;
			case 4:
				System.out.println("Quantity sold: ");
				quantity = input.nextInt();
				product4 = product4 + 4.49*quantity;
				continue;
			case 5:
				System.out.println("Quantity sold: ");
				quantity = input.nextInt();
				product5 = product5 + 6.87*quantity;
				continue;
				
			}
		}while(number != -1);
		total = product1 + product2 + product3 + product4 + product5;
		System.out.println("Total value of all products: " + total);

	}

}
