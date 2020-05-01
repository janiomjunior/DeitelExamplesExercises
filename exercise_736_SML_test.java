import java.security.SecureRandom;

public class exercise_736_SML_test {

	static int[] information = {1007,1008, 2007, 3008, 2109, 1109, 4300, 0000,0000,0000}; 
											
											
	static int[] information2 = {1009,1010, 2009, 3110, 4107, 1109, 4300,1110,4300,0000,0000};
											
	static int [] information3 = {1023,1024,2023,3024,1025,3025,1026,3026,1027,3027,1028,3028
								 ,1029,3029,1030,3030,1031,3031,1032,3032,2132,1132,4300};
	static int [] information4 = {1023,1024,1025,1026,1027,1028
									,1029,4300,2023,3024,3025,3026,3027,3028,3029,2129,1030,
									4300,2029,3230,2130,1130,4300};
	static SecureRandom Random = new SecureRandom();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise_736_SML program = new exercise_736_SML();
		
//	for(int i = 1; i <= 7; i++) {
//		information4[i] = -5 + Random.nextInt(10);
//	}
		program.putInfo(information4);
	}

}
