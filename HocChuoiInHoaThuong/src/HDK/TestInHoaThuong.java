package HDK;

public class TestInHoaThuong {

	public static void main(String[] args) {
		String s1 = "khánh";
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		String s2 = "khánh";
		// Đổi chữ cái đầu tiên thành in hoa
		s2 = s2.replaceFirst((s2.charAt(0)+""), (s2.charAt(0)+"").toUpperCase());
		System.out.println(s2);
		
		String s3 = "KHÁNH";
		s3 = s3.toLowerCase();
		s3 = s3.replaceFirst((s3.charAt(0)+""), (s3.charAt(0)+"").toUpperCase());
		System.out.println(s3);
	}

}
