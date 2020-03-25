package HDK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NhapNgayThangNam {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int yearnow = cal.get(Calendar.YEAR);
		
		System.out.println("Nhập ngày/tháng/năm sinh:");
		String ns=new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday = sdf.parse(ns);
			cal.setTime(birthday);
			int yearns=cal.get(Calendar.YEAR);
			int tuoi = yearnow - yearns;
			System.out.println("Bạn "+tuoi+" tuổi");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
