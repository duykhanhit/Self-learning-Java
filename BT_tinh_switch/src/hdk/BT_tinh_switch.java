package hdk;

import java.util.Scanner;

public class BT_tinh_switch {

	public static void main(String[] args) {

		while(true)
		{
			System.out.println("Nhập số a: ");
			int a = new Scanner(System.in).nextInt();
			System.out.println("Nhập số b: ");
			int b = new Scanner(System.in).nextInt();
			System.out.println("Chọn phép toán:(+,-,*,/) ");
			char pt = new Scanner(System.in).nextLine().charAt(0);

			switch(pt)
			{
			case '+':
				System.out.println("Tổng a + b = "+(a+b));
				break;
			case '-':
				System.out.println("Hiệu a - b = "+(a-b));
				break;
			case '*':
				System.out.println("Tích a*b = "+(a*b));
				break;
			case '/':
				if(b == 0)
					System.out.println("Phép chia không hợp lệ!");
				else
					System.out.println("Thương a/b = "+(a/b));
				break;
			default:
				System.out.println("Nhập sai phép toán rồi ^^");
			}
			System.out.println("Tính nữa không?(y/n):");
			String line = new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("n"))
				break;
		}
		System.out.println("Kết thúc!");
	}

}
