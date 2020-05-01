import java.util.Scanner;

public class exercise4_38 {

	public static void main(String[] args) {
		
		int numero;
		int i;
		double fatorial = 1;
		double e = 1;
		double ex = 1;
		
		
		Scanner input = new Scanner (System.in);
		System.out.print("Ëntre com o numero fatorial: ");
		numero = input.nextInt();
		
		for(i = numero ; i > 0; i--) {
			fatorial = i * fatorial;
			e = e + (1/fatorial);
			ex = e + (1/fatorial);
		}
		System.out.println("Fatorial: " + fatorial);
		System.out.println("constant: " + e);
		System.out.println("constant ex: " + ex);

	}

}
