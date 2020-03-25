package hdk;

import java.util.Scanner;

public class BT_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số:");
		int n = sc.nextInt();
		int gt = 1, i;
		for( i = 1 ; i <= n; i++)
		{
			gt *=i;
		}
		System.out.println(n +"! = "+gt);

	}

}
