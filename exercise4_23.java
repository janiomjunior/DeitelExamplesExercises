import java.util.Scanner;

public class exercise4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int number=0;
		int var1=0;
		int var2=0;;
		int largest=0;
		int sLargest=0;
		
		for(count = 0; count < 5; count++) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Next integer: ");
			number = input.nextInt();
			var1 = number;
			if( var1 > largest){
				//var2 = var1;
				sLargest = largest;
				largest = var1;
			} else if ( var1 > sLargest ){
					sLargest = var1;
					//if(var2 > sLargest)
					//sLargest = var1;
				}
		}
		
		
		
		System.out.println("The Largest: " + largest);
		System.out.println("The second Largest: " + sLargest);

	}
	}

