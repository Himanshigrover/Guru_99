package Loops;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 0 
		 * 01
		 * 012
		 * 0123
		 */
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (j <= i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
