package HDK;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {

	public static void game()
	{
		Random rd=new Random();
		int soMay=rd.nextInt(101);
		
		System.out.println("Máy đã chọn 1 số từ 0-100");
		int soNguoi;
		int solandoan = 0;
		
		do {
			System.out.println("Nhập dự đoán: ");
			soNguoi = new Scanner(System.in).nextInt();
			
			solandoan++;
			System.out.println("Đoán lần "+solandoan);
			
			if(soNguoi == soMay)
			{
				System.out.println("CHÚC MỪNG BẠN ĐÃ ĐOÁN ĐÚNG!");
				break;
			}
			if(soNguoi < soMay)
			{
				System.out.println("Đoán sai! Số cần tìm lớn hơn "+soNguoi);
			}
			else
			{
				System.out.println("Đoán sai! Số cần tìm nhỏ hơn "+soNguoi);
			}
			
			if(solandoan == 7)
			{
				System.out.println("Game Over");
				break;
			}
			
		}
		while(solandoan <= 7);
	}
	
	public static void main(String[] args) {
		while(true)
		{
			game();
			
			System.out.println("Có muốn chơi tiếp không?(y/n)");
			String tl=new Scanner(System.in).nextLine();
			
			if(tl.equalsIgnoreCase("n"))
				break;
		}
		System.out.println("Hẹn gặp lại!");
	}

}
