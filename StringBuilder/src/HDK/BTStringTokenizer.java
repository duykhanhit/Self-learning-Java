package HDK;

import java.util.StringTokenizer;

public class BTStringTokenizer {

	public static void main(String[] args) {
		String s1="An Binh Chung";
		StringTokenizer st1=new StringTokenizer(s1);
		
		while(st1.hasMoreTokens())
		{
			String value=st1.nextToken();
			System.out.println(value);
		}
		
		System.out.println("===========");
		
		String s2="Bo;Khanh;vi;dai hihi";
		StringTokenizer st2=new StringTokenizer(s2,"; ");
		
		while(st2.hasMoreTokens())
		{
			String value=st2.nextToken();
			System.out.println(value);
		}
	}

}
