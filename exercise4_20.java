import java.util.Scanner;

public class exercise4_20 {

	public static void main(String[] args) {
		String name;
		int workedHours;
		int hourlyRates;
		int quantity=0;
		int calcHours;
		//int extrHours;
		int count=0;
		//int quantity = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number of Employees: ");
		quantity = input.nextInt();
		
		while(count <= quantity) {
			
			System.out.println("Employee Name: ");
			name = input.next();
			System.out.println("Worked Hours: ");
			workedHours = input.nextInt();
			System.out.println("Hourly Rates: ");
			hourlyRates = input.nextInt();
			System.out.println("The Employee " + name + ":");
			System.out.println(" Worked " + workedHours + " The gross pay: ");
				if(workedHours > 40) {
					calcHours = hourlyRates * 40 + ((hourlyRates/2) + hourlyRates) * (workedHours - 40);
				} else {
					calcHours = hourlyRates * 40;
				}
			System.out.println(calcHours);
			count++;
		}

	}

}
