package GameTaiXiu;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin = 10000, tiendat = 0, kq, chon;
		do
			{
			System.out.println("Xin chào! Bạn đang có "+coin+" VNĐ");
			System.out.println("Menu");
			System.out.println("1. Nạp tiền");
			System.out.println("2. Chơi game");
			System.out.println("3. Rút tiền");
			System.out.println("Nhập lựa chọn:");
			int op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Nhập số tiền muốn nạp: ");
				coin = coin + sc.nextInt();
				System.out.println("Bạn có "+coin+" trong tài khoản!");
				break;
			case 2:
				if(coin > 0) {
				Random rd = new Random();
				int a = rd.nextInt(6);
				int b = rd.nextInt(6);
				int c = rd.nextInt(6);
				if(a+b+c+3 >10)
					kq = 1;
				else
					kq = 2;
				System.out.println("Chọn cửa: ");
				System.out.println("1. Tài \t2. Xỉu");
				chon = sc.nextInt();
				do {
					System.out.println("Nhập số tiền: ");
					tiendat = sc.nextInt();
				}while(tiendat > coin);
				
				System.out.println("Xúc sắc 1: "+(a+1)+" điểm");
				System.out.println("Xúc sắc 2: "+(b+1)+" điểm");
				System.out.println("Xúc sắc 3: "+(c+1)+" điểm");
				if(kq==1 && chon==1)
				{
					System.out.println("Bạn vừa nhận được "+(tiendat*90/100)+" VNĐ");
					coin += tiendat*90/100;
				}
				else if(kq==2 && chon==2)
				{
					System.out.println("Bạn vừa nhận được "+(tiendat*90/100)+" VNĐ");
					coin += tiendat*90/100;
				}
				else
				{
					System.out.println("Bạn vừa thua "+tiendat+" VNĐ");
					coin -= tiendat;
				}
				break;
				}
				else
					System.out.println("Hãy nạp thêm tiền để chơi...");
			case 3:
//				ruttien();
				break;
			}
			}while(true);
		
	}
}
