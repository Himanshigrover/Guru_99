package Loops;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pattern :
			0123456
			012345
			01234
			0123
			012
			01
			0

		*/
		
		for (int i = 6; i <= 6 && i>=0; i--) {
			for (int j = 0; j <= 6; j++) {
				if(i>=j)
				{
					System.out.print(j);
				}			
			}
			System.out.println();
		}
	}

}
