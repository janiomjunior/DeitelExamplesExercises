import java.security.SecureRandom;
import java.util.ArrayList;
public class exercise_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] f = new int[10] ;
		System.out.println(f[6]);
		SecureRandom randomNumbers = new SecureRandom();
		
		int [] g = new int[5];
		for (int i = 0; i < g.length; i++) {
			g[i] = 8;
			System.out.println(g[i]);
		}
		
		float [] c = new float[100];
		int total = 0;
		for(int i = 0; i < c.length ; i++) {
			c[i] = i;
			total += i ;
		}
		System.out.println(total);
		
		int [] a = new int[11];
		int [] b = new int[34];
		
		for (int i = 0 ; i < a.length ; i++) {
			a[i] = 1;
		}
		for (int i = 0 ; i < b.length ; i++) {
			b[i] = 2;
		}
		for(int i = 0 ; i < 34 ; i++) {
			if(i < 11) {
				b[i] = a[i];
			}
			//System.out.println(b[i]);
		}
		
		float[] w = new float[99];
		float smallest = 100;
		float largest = 0;
			for(int i = 0; i < w.length; i++) {
				w[i] = randomNumbers.nextInt(100);
				if(i % 10 == 0) {
					System.out.println();
				}
				System.out.print("  " + w[i]);
				if(w[i] < smallest) {
					smallest = w[i];
				}
				if(w[i] > largest){
					largest = w[i];
				}
			}
			System.out.println();
		System.out.println("The smallest number is :" + smallest);
		System.out.println("The largest number is :" + largest);
	}

}
