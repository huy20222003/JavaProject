import java.util.Scanner;

public class HocBongAptech {
	private String dangKyKhoaHoc;
	private int diemTongKet;
	private String viPhamNoiQuy;
	private String thiLanDau;
	
	public HocBongAptech() {
		this.dangKyKhoaHoc = "";
		this.diemTongKet = 0;
		this.viPhamNoiQuy = "";
		this.thiLanDau = "";
	}
	/**
	 * @param dangKyKhoaHoc
	 * @param diemTongKet
	 * @param viPhamNoiQuy
	 * @param thiLanDau
	 */
	public HocBongAptech(String dangKyKhoaHoc, int diemTongKet, String viPhamNoiQuy, String thiLanDau) {
		this.dangKyKhoaHoc = dangKyKhoaHoc;
		this.diemTongKet = diemTongKet;
		this.viPhamNoiQuy = viPhamNoiQuy;
		this.thiLanDau = thiLanDau;
	}
	
	public void InputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoc vien da dang ky khoa hoc[Y/N]: ");
		dangKyKhoaHoc = sc.nextLine();
		System.out.println("Diem tong ket cua hoc vien[0->100]: ");
		diemTongKet = sc.nextInt();
		sc.nextLine();
		System.out.println("Hoc vien co vi pham noi quy[Y/N]: ");
		viPhamNoiQuy = sc.nextLine();
		System.out.println("Hoc vien thi lan dau[Y/N]");
		thiLanDau = sc.nextLine();
		sc.close();
	}
	
	public void xetHocBong() {
		if(dangKyKhoaHoc.equalsIgnoreCase("Y") && diemTongKet >= 75 && !viPhamNoiQuy.equalsIgnoreCase("Y") && thiLanDau.equalsIgnoreCase("Y")) {
			System.out.println("Hoc vien da nhan duoc hoc bong cua Aptech");
		} else {
			System.out.println("Hoc vien khong nhan duoc hoc bong cua Aptech");
		}
	}
	
}
