package HDK;

import java.util.Scanner;

public class SNT {

	public static int KtraSNT(int n) {
		if(n<2)
			return 0;
		for(int i = 2; i <= Math.sqrt(n); i++)
			if(n%i==0)
				return 0;
		return 1;
	}
	public static void main(String[] args) {
		System.out.println("Nhập số cần kiểm tra: ");
		int n = new Scanner(System.in).nextInt();
		if(KtraSNT(n)==1)
			System.out.println(n+" là số nguyên tố!");
		else
			System.out.println(n+" không là số nguyên tố!");
	}

}
