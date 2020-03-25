package HDK;

import java.util.Scanner;

public class TestChuanHoaChuoi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập vào chuỗi cần chuẩn hóa: ");
		String s = sc.nextLine();
		String s1="";
		s = s.trim();
		s = s.toLowerCase();
		s = s.replaceAll("\\s+"," ");
		String []arr=s.split(" ");
		
		for(int i = 0; i < arr.length; i++)
			{
				arr[i] = arr[i].replaceFirst((arr[i].charAt(0)+""), (arr[i].charAt(0)+"").toUpperCase());
				s1 +=arr[i]+" ";
			}
		System.out.println("Chuỗi sau khi chuẩn hóa: "+s1);
		
	}

}
