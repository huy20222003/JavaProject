
import java.util.Scanner;

public class NhanVien {
	private String ten;
	private int tuoi;
	private String diaChi;
	private double tienLuong;
	private int tongSoGioLamViec;
	
	public NhanVien() {
		this.ten = "";
		this.tuoi = 0;
		this.diaChi = "";
		this.tienLuong = 0.0f;
		this.tongSoGioLamViec = 0;
	}
	
	public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLamViec) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.tienLuong = tienLuong;
		this.tongSoGioLamViec = tongSoGioLamViec;
	}



	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}


	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}



	/**
	 * @return the tuoi
	 */
	public int getTuoi() {
		return tuoi;
	}



	/**
	 * @param tuoi the tuoi to set
	 */
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}



	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}



	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	/**
	 * @return the tienLuong
	 */
	public double getTienLuong() {
		return tienLuong;
	}



	/**
	 * @param tienLuong the tienLuong to set
	 */
	public void setTienLuong(double tienLuong) {
		this.tienLuong = tienLuong;
	}



	/**
	 * @return the tongSoGioLamViec
	 */
	public int getTongSoGioLamViec() {
		return tongSoGioLamViec;
	}



	/**
	 * @param tongSoGioLamViec the tongSoGioLamViec to set
	 */
	public void setTongSoGioLamViec(int tongSoGioLamViec) {
		this.tongSoGioLamViec = tongSoGioLamViec;
	}

	public void InputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
		
		System.out.println("Nhap tien luong: ");
		tienLuong = sc.nextDouble();
		System.out.println("Nhap so gio lam viec: ");
		tongSoGioLamViec = sc.nextInt();
		sc.close();
	}
	
	public void OutPut() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Ten cua nhan vien: ").append(ten).append("\n");
	    builder.append("Tuoi cua nhan vien: ").append(tuoi).append("\n");
	    builder.append("Dia chi cua nhan vien: ").append(diaChi).append("\n");
	    builder.append("Tien luong cua nhan vien:  ").append(tienLuong).append("\n");
	    builder.append("Tong so gio lam viec cua nhan vien:  ").append(tongSoGioLamViec).append("\n");
	    System.out.println(builder.toString());
	}

	
	public double tinhThuong() {
	    double tienThuong = (tongSoGioLamViec >= 200) ? tienLuong * 2 : (tongSoGioLamViec >= 100 && tongSoGioLamViec < 200) ? tienLuong * 1.1 : 0;
	    return tienThuong;
	}


}