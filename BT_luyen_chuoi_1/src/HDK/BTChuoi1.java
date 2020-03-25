package HDK;

public class BTChuoi1 {

	public static String layTenCoMP3(String baihat) {
		int vtCuoi = baihat.lastIndexOf("/");
		String ten = baihat.substring(vtCuoi+1);
		return ten;
	}
	public static String layTenKoMP3(String baihat) {
		int vtCuoi1 = baihat.lastIndexOf("/");
		int VtCuoi2 = baihat.lastIndexOf(".");
		String ten = baihat.substring(vtCuoi1+1, VtCuoi2);
		return ten;
	}
	public static void main(String[] args) {
		String baihat ="D://baihat/nhactre/haytraochoanh.mp3";
		String kq1 = layTenCoMP3(baihat);
		System.out.println(kq1);
		
		String kq2 = layTenKoMP3(baihat);
		System.out.println(kq2);
	}

}
