import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class exercise_714 {

	 public static int products(int... numbers) {
		 int product=1;
	 
		 for(int i = 0; i < numbers.length ; i++) {
			 product *= numbers[i];
		 }
		 return product;
	 }
	      
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 2;
		int n2 = 1;
		int n3 = 1;
		int n4 = 5;
	
		System.out.print(products(n2,n3)); 
		
	}
}


