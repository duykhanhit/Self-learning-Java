package HDK;

import java.util.Scanner;

public class BT_Fibonacci {

	public static long fibonacci(long n) {
		long a = 1, b = 0, temp;
		
		while(n>0) {
			temp = a;
			a = a + b;
			b = temp;
			n--;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println("Tìm số thứ mấy trong dãy Fibonacci: ");
		long n = new Scanner(System.in).nextLong();
		System.out.println("Số thứ "+n+" là "+fibonacci(n));
	}

}
