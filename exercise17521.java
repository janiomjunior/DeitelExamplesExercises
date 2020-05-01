
public class exercise17521 {

	public static void main(String[] args) {
		int side1;
		int side2;
		int hypo;
		int cat1;
		int cat2;
		int hypotenuse;
		//int result;
		
		for(side1 = 1; side1 <= 100; side1++) {
			for(side2 = 1; side2 <= 100; side2++) {
				for(hypo =1 ; hypo <= 100 ; hypo++) {
					cat1 = side1*side1;
					cat2 = side2*side2;
					hypotenuse = hypo*hypo;
					if(cat1 + cat2 == hypotenuse) {
						System.out.println("Right tringle sides " + side1 + ' ' + side2 + ' ' + hypo);
					}
				}
			}
		}

	}

}
