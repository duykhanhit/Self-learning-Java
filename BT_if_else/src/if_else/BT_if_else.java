package if_else;

import java.util.Scanner;

public class BT_if_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng: ");
		int a = sc.nextInt();
		if(a == 4 || a == 6 || a == 9 || a == 11)
			System.out.println("Tháng " + a +" có 30 ngày!");
		else if(a == 2)
			System.out.println("Tháng " + a + " có 28 ngày!");
		else if(a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
			System.out.println("Tháng " + a +" có 31 ngày!");
		else
			System.out.println("Nhập sai tháng rồi!");
		
	}
}
