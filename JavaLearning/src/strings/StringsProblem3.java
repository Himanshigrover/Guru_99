package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringsProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*input: aaabbc
o/p =a3b2c1*/
		
		
		String str= "aaabbc";
		int count = 0;
		String chars[] = str.split("");
		for (int i=0 ; i< chars.length; i++)
		{
			System.out.println(chars[i]);
		}
		}

}
