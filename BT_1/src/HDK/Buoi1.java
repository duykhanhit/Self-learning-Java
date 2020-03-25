package HDK;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Buoi1 {
	// Hàm tìm ước chung lớn nhất
	public static int UCLN(int a, int b) {
		if( b == 0)
			return a;
		return UCLN(b,a%b);
	}
	
	// Hàm tính tổng dãy số
	public static float Sum(float a) {
		float Sum = 0;
		int dau = -1;
		for(int i = 1; i <= a; i++)
		{
			dau *= -1;
			Sum += dau*1.0/i;
		}
		return Sum;
	}
	
	// Hàm tính giai thừa
	public static int GiaiThua(int a) {
		int gt = 1;
		for(int i = 1; i <= a; i++)
			gt *= i;
		return gt;
	}
	
	// Hàm tính e^x
	public static float eMu(float a) {
		float e = 1, saiso;
		int i = 1;
		saiso = a;
		while(saiso > 0.000001) {
			e += saiso;
			i++;
			saiso *= a/i;
		}
		return e;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		System.out.println("===================MENU==================");
		System.out.println("1. Tìm UCLN \t\t 2. Tính tổng dãy số");
		System.out.println("3. Tính giai thừa \t 4. Tính e^x");
		System.out.println("5. Thoát");
		do {
			System.out.println("Mời nhập lựa chọn: ");
			op = input.nextInt();
			switch(op) {
			case 1:
				System.out.println("Nhập số thứ nhất: ");
				int a = input.nextInt();
				System.out.println("Nhập số thứ hai: ");
				int b = input.nextInt();
				System.out.println("UCLN là "+UCLN(a,b));
				break;
			case 2:
				System.out.println("Nhập vào số n: ");
				int n = input.nextInt();
				System.out.println("Tổng = "+Sum(n));
			case 3:
				System.out.println("Nhập vào số: ");
				int c = input.nextInt();
				System.out.println(c+"! = "+GiaiThua(c));
			case 4:
				System.out.println("Nhập vào số x: ");
				float x = input.nextFloat();
				System.out.println("e^"+x+" = "+eMu(x));
			}
						
		}while(op < 5 && op > 0);
		System.out.println("Hẹn gặp lại!");
	}
}
