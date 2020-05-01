
public class exercise16520 {

	public static void main(String[] args) {
		
		double pi = 0;
		double den;
		
		for (den = 1; den < 770000; den+=4) {
			System.out.println(den);
			pi = pi + (4/den) - (4/(den+2));
			System.out.println(pi);
		}

	}

}
