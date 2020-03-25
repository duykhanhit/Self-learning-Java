package HDK;

import java.util.Scanner;

public class TestPalyndrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		char []arr = s.toCharArray();
		boolean flag=true;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != arr[arr.length-i-1])
				flag = false;
		}
		if(flag == true)
			System.out.println(s+" là chuỗi palyndrome");
		else
			System.out.println(s+" ko là chuỗi palyndrome");
	}

}
