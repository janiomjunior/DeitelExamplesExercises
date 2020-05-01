import java.util.Scanner;

// CAR MILEAGE
public class exercise4_17 {
	
	public static void main(String[] args) {
		
		int trips = 0;
		int miles = 0;
		int galons = 0;
		int total = 0;
		int average = 0;
		int counter = 0;
		int allTrips = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of trips : ");
		trips = input.nextInt();
		
		while(counter != trips) {
			
			System.out.println("Enter Miles");
			miles = input.nextInt();
			System.out.println("Enter galons");
			galons = input.nextInt();
			System.out.println("Average");
			average = miles/galons;
			System.out.println(average);
			total += average;
			
			counter++;
			
		}
		allTrips = total / trips;
		System.out.println("Average Trips2");
		System.out.print(allTrips);
	

}
}
