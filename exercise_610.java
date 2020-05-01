
public class exercise_610 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3;
		System.out.printf("%nInt value: %n%f", x + 0.5);
		System.out.printf("%nRounded value: %n%f", roundToInteger(x));
		
		x = 12;
		System.out.printf("%nTenths value: %n%f", x + 0.5);
		System.out.printf("%nRounded value: %n%f", roundToTenths(x));
		
		x = 103;
		System.out.printf("%nHundredths value: %n%f", x + 0.5);
		System.out.printf("%nRounded value: %n%f", roundToHundredths(x));
		
		x = 1026;
		System.out.printf("%nThousands value: %n%f", x + 0.5);
		System.out.printf("%nRounded value: %n%f", roundToThousands(x));
	}
	public static double roundToInteger (double x) {
		double y = Math.floor(x + 0.5);
			return y;	
	}
	public static double roundToTenths (double x) {
		double y = Math.floor(x*10 + 0.5)/10;
			return y;	
	}
	public static double roundToHundredths (double x) {
		double y = Math.floor(x*100 + 0.5)/100;
			return y;	
	}
	public static double roundToThousands (double x) {
		double y = Math.floor(x*1000 + 0.5)/1000;
			return y;	
	}
}
