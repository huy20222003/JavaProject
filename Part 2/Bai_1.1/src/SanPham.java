
public class SanPham {
	private String Name;
	private double Price;
	private double Discount;
	
	final double THUE_NHAP_KHAU = 0.1;
	
	public SanPham() {
		
	}

	public SanPham(String name, double price, double discount) {
		this.Name = name;
		this.Price = price;
		this.Discount = discount;
	}
	
	public SanPham(String name, double price) {
		this.Name = name;
		this.Price = price;
	}
	
	public double getImportTax() {
		return this.Price * THUE_NHAP_KHAU;
	}
	
	public void showSanPham() {
		
	}
}
