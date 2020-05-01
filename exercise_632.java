
public class exercise_632 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("The distace is: %f", distance(3,2,7,8));
	}
static double distance( double x1, double y1, double x2, double y2) {
	double result1 = (Math.pow(x2-x1, 2)) + (Math.pow(y2-y1,2));
	double result2 = Math.sqrt(result1);
	return result2;
}

}
