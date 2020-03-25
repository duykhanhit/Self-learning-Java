package hdk;

import java.util.Scanner;

public class BT_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số: ");
		int n = sc.nextInt();
		int gt = 1, i = 1;
		while(i <= n)
		{
			gt *= i;
			i++;
		}
		System.out.println(n +"! = " +gt);

	}

}
