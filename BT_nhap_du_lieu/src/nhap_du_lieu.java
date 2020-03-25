import java.util.Scanner;

public class nhap_du_lieu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số:");
		int a = sc.nextInt();
		System.out.println("Số vừa nhập: "+a);
		
		System.out.println("Nhập chuỗi:");
		String line = new Scanner(System.in).nextLine();
		System.out.println("Chuỗi vừa nhập: " + line);
	}

}
