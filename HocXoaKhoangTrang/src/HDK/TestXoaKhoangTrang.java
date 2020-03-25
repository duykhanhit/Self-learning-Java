package HDK;

public class TestXoaKhoangTrang {

	public static void main(String[] args) {
		String s = "   Xin chào các bạn   ";
		s = s.trim();
		System.out.println(s);
		
		String s1 = "   Xin chào các bạn   ";
		int i = 0, vtLeft = 0;
		for(i = 0; i < s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(c == ' ')
				vtLeft=i;
			else
				break;
		}
		s1 = s1.substring(i);
		System.out.println(s1);
		
		String s2 = "   Xin chào các bạn   ";
		i = 0;
		int vtRight = 0;
		for(i = s2.length() - 1; i >= 0; i--)
		{
			char d = s2.charAt(i);
			if(d == ' ')
				vtRight = i;
			else
				break;
		}
		s2 = s2.substring(0, vtRight);
		System.out.println(s2);
	}

}
