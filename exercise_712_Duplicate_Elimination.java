
public class exercise_712_Duplicate_Elimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {10,11,12,13,10};
		duplicate(array);
	}
public static void duplicate( int[] numbers) {
	int [] check = {0, 0, 0, 0, 0};
	int cont = 0;
	for(int i = 0; i < numbers.length ; i++) {
		cont = 0;
		for (int j = 0; j < i ; j++) {
			if (numbers[i] == check [j] ){
				System.out.println("Number already read!");
				cont++;
				break;
			} 
		
		
	}
		if(cont == 0) {
			check[i] = numbers[i];
			System.out.println(numbers[i]);
		}	
}
}
}

