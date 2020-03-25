package hdk;

import java.util.Scanner;

public class BT_break {

	public static void main(String[] args) {
		while(true)
		{
			System.out.println("Nhập số:");
			int n = new Scanner(System.in).nextInt();
			if(n % 2 == 0)
				System.out.println(n+" là số chẵn");
			else
				System.out.println(n+" là số lẻ");
			
			System.out.println("Muốn kiểm tra tiếp không?(c/k)");
			String line = new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k"))
				break;
		}
		
		System.out.println("Kết thúc!");

	}

}
