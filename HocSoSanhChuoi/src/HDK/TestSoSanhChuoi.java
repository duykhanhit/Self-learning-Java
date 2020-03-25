package HDK;

public class TestSoSanhChuoi {

	public static void main(String[] args) {
		String s1 = "KHÁNH";
		String s2 = "khánh";
		// so sánh phân biệt chữ hoa trả về nhỏ hơn or lớn hơn
		int kq1 = s1.compareTo(s2);
		System.out.println(kq1);
		// so sánh không phân biệt chữ hoa trả về nhỏ hơn or lớn hơn
		int kq2 = s2.compareToIgnoreCase(s2);
		System.out.println(kq2);
		// so sánh phân biệt chữ hoa trả về true false
		if(s1.equals(s2))
			System.out.println("s1==s2");
		else
			System.out.println("s1!=s2");
		// so sánh không phân biệt chữ hoa trả về true false
		if(s1.equalsIgnoreCase(s2))
			System.out.println("s1==s2");
		else
			System.out.println("s1!=s2");
	}

}
