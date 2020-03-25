package HDK.test;

import HDK.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien a = new SinhVien();
		SinhVien b = new SinhVien("Khánh",8);
		System.out.println("Điểm của "+b.getHoTen()+" là: "+b.getDiem());
		System.out.println("Tên: "+a.getHoTen());
		a.setHoTen("Hoàng Duy Khánh");
		System.out.println("Tên: "+a.getHoTen());
		b.xuatThongTin();
		System.out.println(b);
	}

}
