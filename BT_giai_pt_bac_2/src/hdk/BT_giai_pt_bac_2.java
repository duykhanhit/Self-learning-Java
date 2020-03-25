package hdk;

import java.util.Scanner;

public class BT_giai_pt_bac_2 {

	/**
	 * Giải phương trình bậc 2: ax^2 + bx + c = 0
	 * 
	 * @param a - Hệ số a
	 * @param b - Hệ số b
	 * @param c - Hệ số c
	 */
	public static void GiaiPTB2(double a, double b, double c) {
		if (a != 0) {
			double delta = b * b - 4 * a * c;
			if (delta < 0)
				System.out.println("Phương trình vô nghiệm!");
			else if (delta == 0)
				System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + (-b / (2 * a)));
			else {
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				System.out.println("\t x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
				System.out.println("\t x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
			}
		} else
			System.out.println("Phương trình bạn nhập không phải phương trình bậc 2!");

	}

	public static void main(String[] args) {
		System.out.println("Giải phương trình ax^2 + bx + c = 0");
		System.out.println("Nhập a = ");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("Nhập b = ");
		double b = new Scanner(System.in).nextDouble();
		System.out.println("Nhập c = ");
		double c = new Scanner(System.in).nextDouble();
		GiaiPTB2(a, b, c);

	}
}
