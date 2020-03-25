package HDK;

public class TestTachChuoi {

	public static void main(String[] args) {
		String s = "2018602093;Hoàng Duy Khánh;CNTT3";
		String []arr = s.split(";"); // Nếu có ký tự bất kỳ khác ; thì thêm \\ vào trước
		if(arr.length == 3)
		{
			System.out.println("Mã SV: "+arr[0]);
			System.out.println("Họ tên: "+arr[1]);
			System.out.println("Lớp: "+arr[2]);
		}
		
		System.out.println("--------------");
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		System.out.println("--------------");
		for(String x: arr)
			System.out.println(x);
	}

}
