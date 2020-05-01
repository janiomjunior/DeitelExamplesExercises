
public class exercise_612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1<=n<=2
		double x = Math.floor(1 + Math.random());
		System.out.printf("%nthe number is: %n%f", x);
		
		//1<=n<=100
		 x = Math.floor(1 + Math.random()*99);
		 System.out.printf("%nthe number is: %n%f", x);
		 
		 //0<=n<=9
		 x = Math.floor(Math.random()*9);
		 System.out.printf("%nthe number is: %n%f", x);
		 
		//1000<=n<=1112
		 x = Math.floor(1000 + Math.random()*112);
		 System.out.printf("%nthe number is: %n%f", x);
		 
		//-1<=n<=1
		 x = Math.floor(-1 + Math.random()*2);
		 System.out.printf("%nthe number is: %n%f", x);
		 
		//-3<=n<=11
		 x = Math.floor(-3 + Math.random()*11);
		 System.out.printf("%nthe number is: %n%f", x);
		 
		 
	}

}
