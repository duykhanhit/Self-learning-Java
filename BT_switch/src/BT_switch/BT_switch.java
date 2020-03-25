package BT_switch;

import java.util.Scanner;

public class BT_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng: ");
		int t = sc.nextInt();
		switch(t)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng có 31 ngày!");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng có 30 ngày!");
			break;
		case 2:
			System.out.println("Tháng có 28 ngày!");
			break;
		default:
			System.out.println("Nhập sai tháng rồi!");
		}

	}

}
