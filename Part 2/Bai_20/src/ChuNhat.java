
public class ChuNhat {
	protected int rong;
	protected int dai;
	
	public ChuNhat() {
		
	}
	
	public ChuNhat(int rong, int dai) {
		this.rong = rong;
		this.dai = dai;
	}
	
	public int getChuVi() {
		return (dai + rong) * 2;
	}
	
	public int getDienTich() {
		return dai * rong;
	}
	
	public void xuat() {
		System.out.println("Chieu dai hcn la: " + dai);
		System.out.println("Chieu rong hcn la: " + rong);
		System.out.println("Chu vi hcn la: " + getChuVi());
		System.out.println("Dien tich hcn la: " + getDienTich());
	}
}
