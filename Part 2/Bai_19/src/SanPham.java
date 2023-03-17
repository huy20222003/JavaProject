import java.util.Scanner;

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

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return Price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		Price = price;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return Discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		Discount = discount;
	}

	/**
	 * @return the tHUE_NHAP_KHAU
	 */
	public double getTHUE_NHAP_KHAU() {
		return THUE_NHAP_KHAU;
	}

	public void inputSanPham() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		this.Name = sc.nextLine();
		System.out.println("Enter Price: ");
		this.Price = sc.nextDouble();
		System.out.println("Enter Discount: ");
		this.Discount = sc.nextDouble();
	}
	
	public void showSanPham() {
		System.out.printf("|%12s|%12s|%10s|%10s|\n", "Name", "Price", "Discount", "ImportTax");
		System.out.printf("|%12s|%10.3f|%10.1f|%10.1f|\n", this.Name, this.Price, this.Discount, this.THUE_NHAP_KHAU);
	}
}
