package strings;

public class StringsProblem2 {

	public static void main(String[] args) {
		
		/*Return the number of times that the string "hi" appears anywhere in the given string.


		countHi("abc hi ho") → 1
		countHi("ABChi hi") → 2
		countHi("hihi") → 2*/
		
		
		String str = "ABChi hi";
		int count= 0;
		
		for (int i=0; i<=str.length()-2;i++)
		{
			char c = str.charAt(i);
			char c1 = str.charAt(i+1);
			if (c == 'h' && c1== 'i')
			{
				count++;
			}
			
		}
		System.out.println(count);

	}
	
	
	
	

}
