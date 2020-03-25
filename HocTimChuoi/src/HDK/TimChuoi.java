package HDK;

import java.util.StringTokenizer;

public class TimChuoi {

	public static void main(String[] args) {
		String s="Công ty Nhật có trụ sở tại Nhật mới vào Việt Nam có nhu cầu tuyển dụng";
		int vt1=s.indexOf("có");
		System.out.println("Chữ có đầu tiên ở "+vt1);
		int vt2=s.lastIndexOf("có");
		System.out.println("Chữ có cuối cùng ở "+vt2);
		int vt3=s.indexOf("ụ");
		System.out.println("Chữ u đầu tiên ở "+vt3);
		int vt4=s.indexOf("Khánh");
		if(vt4==-1)
			System.out.println("Không tìm thấy \"Khánh\"");
		else
			System.out.println("Đã tìm thấy");
		if(s.contains("sở")==true)
			System.out.println("Tìm thấy từ sở");
		else
			System.out.println("Không tìm thấy");
		
		int dem = 0;
		StringTokenizer token=new StringTokenizer(s);
		while(token.hasMoreTokens())
		{
			String value=token.nextToken();
			if(value.contains("có")) //đếm cả từ VD: cóng +1 "có"!
			//if(value.equals("có")) //chỉ đếm từ "có"!
				dem++;
		}
		System.out.println("Chữ có xuất hiện "+dem+" lần");
	}

}
