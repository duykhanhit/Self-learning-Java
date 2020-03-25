package hdk;

import java.util.Scanner;

public class BT_ren_luyen_for {

	public static double TinhS(int x, int n) {
		double S = 0;
		double ms = 0;
		for(int i = 1; i <= n; i++)
		{
			ms += i;
			S += (Math.pow(x, i))/ms;
		}
		return S;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập x:");
		int x = input.nextInt();
		System.out.println("Nhập n:");
		int n = input.nextInt();
		System.out.println("S = "+TinhS(x, n));
	}

}
