
public class exercise4_33 {

	public static void main(String[] args) {
		int r = 1;
		int c = 1;
		int conferec;
		int conferer;
		for(r = 1; r <= 8; r++) {
			c = 1;
			for(c = 1; c <= 16; c++) {
				conferec = c % 2;
				conferer = r % 2;
				if(conferer == 0) {
					
				
					if(conferec == 1) {
						System.out.print(" ");
						System.out.print("* ");
					}else
						System.out.print("");
		}else {
					if(conferec == 1)
					System.out.print("* ");
					else
					System.out.print(" ");
			}
			}
			System.out.println();
		}

	}

}
