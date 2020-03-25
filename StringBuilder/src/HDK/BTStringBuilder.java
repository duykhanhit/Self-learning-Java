package HDK;

public class BTStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Hello ");
		sb.append("World");
		sb.append("!!!");
		sb.insert(5, " Khanh");
		String s=sb.toString();
		System.out.println(s);
		sb.delete(11, 17);
		s=sb.toString();
		System.out.println(s);
		
	}

}
