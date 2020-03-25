package HDK;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NgayThangNam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(day);
		System.out.println(month+1);
		System.out.println(year);
		
		Date t=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(t));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(t));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println(sdf3.format(t));

	}

}
