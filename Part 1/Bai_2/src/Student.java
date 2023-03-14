import java.util.Scanner;

public class Student {
	private String maSv;
	private float diemTB;
	private int tuoi;
	private String tenLop;
	private String hocBong;
	
	public Student() {
		this.maSv = "";
		this.diemTB = 0.0f;
		this.tuoi = 18;
		this.tenLop = "";
		this.setHocBong("Khong");
	}
	
	/**
	 * @param maSv
	 * @param diemTB
	 * @param tuoi
	 * @param tenLop
	 */
	public Student(String maSv, float diemTB, int tuoi, String tenLop, String hocBong) {
		this.maSv = maSv;
		this.diemTB = diemTB;
		this.tuoi = tuoi;
		this.tenLop = tenLop;
		this.setHocBong(hocBong);
	}
	/**
	 * @return the maSv
	 */
	public String getMaSv() {
		return maSv;
	}
	/**
	 * @param maSv the maSv to set
	 */
	public void setMaSv(String maSv) {
		if(this.maSv.length() != 8) {
			System.out.println("Ma sinh vien phai co 8 ky tu");
		} else {
			this.maSv = maSv;
		}
	}
	/**
	 * @return the diemTB
	 */
	public float getDiemTB() {
		return diemTB;
	}
	/**
	 * @param diemTB the diemTB to set
	 */
	public void setDiemTB(float diemTB) {
		if(diemTB < 0 && diemTB > 10) {
			System.out.println("Diem trung binh phai nam trong khoang (0, 10)");
		} else {
			this.diemTB = diemTB;
		}
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
		if(tuoi <= 0) {
			System.out.println("Tuoi phai lon hon 0!");
		} else {
			this.tuoi = tuoi;
		}
	}
	/**
	 * @return the tenLop
	 */
	public String getTenLop() {
		return tenLop;
	}
	/**
	 * @param tenLop the tenLop to set
	 */
	public void setTenLop(String tenLop) {
		if(tenLop.startsWith("A") == false && tenLop.startsWith("C") == false) {
			System.out.println("Ten lop phai bat dau bang chu A hoac C");
		} else {
			this.tenLop = tenLop;
		}
	}
	
	public String getHocBong() {
		return hocBong;
	}

	public void setHocBong(String hocBong) {
		this.hocBong = hocBong;
	}
	
	public void InputInfo() {
		Scanner sc = new Scanner(System.in);
		while(maSv.length() != 8) {
			System.out.println("Nhap ma sinh vien: ");
			maSv = sc.nextLine();
		}
		while(diemTB < 0 || diemTB > 10) {
			System.out.println("Nhap diem cua sinh vien: ");
			diemTB = sc.nextFloat();
		}
		while(tuoi < 0) {
			System.out.println("Nhap tuoi cua sinh vien: ");
			tuoi = sc.nextInt();
		}
		sc.nextLine();
		while(tenLop.startsWith("A") == false && tenLop.startsWith("C") == false) {
			System.out.println("Nhap ten lop cua sinh vien: ");
			tenLop = sc.nextLine();
		}
		sc.close();
	}
	
	public void showInfo() {
		StringBuilder builder = new StringBuilder();
	    builder.append("Ma sinh vien(8 ky tu): ").append(maSv).append("\n");
	    builder.append("Diem trung binh cua sinh vien: ").append(diemTB).append("\n");
	    builder.append("Tuoi cua sinh vien: ").append(tuoi).append("\n");
	    builder.append("Ten Lop cua sinh vien:  ").append(tenLop).append("\n");
	    builder.append("Sinh vien co duoc hoc bong:  ").append(hocBong).append("\n");
	    System.out.println(builder.toString());
	}
	
	public void xetHocBong() {
		setHocBong(diemTB > 8.0 ? "Co" : "Khong");
	}

}
