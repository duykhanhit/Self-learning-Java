package HDK.test;

import HDK.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		TamGiac tg=new TamGiac(3, 4, 5);
		System.out.println("Chu vi = "+tg.tinhChuVi());
		System.out.println("Diện tích = "+tg.tinhDienTich());
		tg.setCanhA(6);
		tg.setCanhB(8);
		tg.setCanhC(10);
		System.out.println("Độ dài các cạnh là: "+tg.getCanhA()+" "+tg.getCanhB()+" "+tg.getCanhC());
	}

}
