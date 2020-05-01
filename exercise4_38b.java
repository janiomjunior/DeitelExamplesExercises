


	import java.util.Scanner;

	public class exercise4_38b {

		public static void main(String[] args) {
			
			int numero;
			int i;
			double fatorial = 1;
			double e = 1;
			double ex = 1;
			
			
			Scanner input = new Scanner (System.in);
			System.out.print("Ëntre com o numero fatorial: ");
			numero = input.nextInt();
			
			for(i = 1 ; i <= numero; i++) {
				fatorial = i * fatorial;
				e = e + (1/fatorial);
				ex = e + (Math.pow(i, i)/fatorial);
			}
			//System.out.println("Fatorial: " + fatorial);
			System.out.println("constant: " + e);
			System.out.println("constant ex: " + ex);

		}

	}