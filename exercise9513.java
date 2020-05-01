import java.util.Scanner;

public class exercise9513 {

	public static void main(String[] args) {
		
		//int numero;
		int i;
		int j;
		long fatorial;
		
		
		
		//Scanner input = new Scanner (System.in);
		//System.out.print("Ëntre com o numero fatorial: ");
		//numero = input.nextInt();
		for(i = 1 ; i <= 20 ; i++ ) {
			fatorial = 1;
			for(j = i ; j > 0; j--) {
				fatorial = j * fatorial;
			
		}
		System.out.println("Fatorial: "+ i + "= "  + fatorial);
		}
		
	

	}

}
