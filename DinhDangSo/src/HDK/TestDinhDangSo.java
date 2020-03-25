package HDK;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào điểm toán: ");
		double a = input.nextDouble();
		System.out.println("Nhập vào điểm lý: ");
		double b = input.nextDouble();
		System.out.println("Nhập vào điểm hóa:");
		double c = input.nextDouble();
		double dtb = (a+b+c)/3;
		System.out.println("Điểm trung bình 3 môn = "+dtb);
		
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("ĐTB = "+dcf.format(dtb));
	}

}
