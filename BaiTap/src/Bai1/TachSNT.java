package Bai1;

import java.util.Scanner;

public class TachSNT {

	public static int checkSNT(int a) {
		if(a<2)
			return 0;
		for(int i = 2; i <= Math.sqrt(a); i++)
			if(a%i==0)
				return 0;
		return 1;
	}
	
	public static void phanTich(int n) {
		int i = 2;
		while(n>1)
		{
			if(checkSNT(i) == 1)
			{
				if(n%i==0)
					{
					System.out.print(i+" ");
					n /= i;
					}
				else
					i++;
			}
			else
				i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số cần tách: ");
		int n;
		n = input.nextInt();
		phanTich(n);
	}

}
