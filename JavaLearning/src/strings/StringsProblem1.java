package strings;

public class StringsProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*input "the" o/p "tthhee"*/
		
		String str ="a";
		String str2 = "";
		for (int i =0 ; i<=str.length()-1 ; i++)
		{
			/* char str1 = str.charAt(i);
			 String str3 = Character.toString(str1);
			 System.out.print(str3 + str3);*/
			
			String str1 =str.substring(i,i+1);
			System.out.print(str1 + str1);
			
			
					
		}
	}

}
