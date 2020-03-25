package HDK;

public class TestString {

	public static void main(String[] args) {
		String s1=new String();
		String s2=new String("Khánh");
		String s3="Khánh";
		
		System.out.println("Độ dài của s1 là "+s1.length());
		System.out.println("Độ dài của s2 là "+s2.length());
		System.out.println("Độ dài của s3 là "+s3.length());
		
		if(s2.length()==s3.length())
			System.out.println("S2 bằng s3");
		else
			System.out.println("S2 không bằng s3");
	}

}
