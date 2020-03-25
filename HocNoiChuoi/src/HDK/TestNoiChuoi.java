package HDK;

public class TestNoiChuoi {

	public static void main(String[] args) {
		String s1 = "Độc lập";
		String s2 = "Tự do";
		
		String s3 = s1+" "+s2;
		System.out.println(s3);
		
		String s4 = s1+(1+2);
		System.out.println(s4);
		
		String s5 = s1+1+2;
		System.out.println(s5);
		
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.append(" ");
		sb.append(s2);
		System.out.println(sb.toString());
	}

}
