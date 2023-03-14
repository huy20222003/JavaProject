
public class Product {
	String Name;
	String Description;
	double Price;
	int Rate;
	
	public Product() {
		this.Name =  "";
		this.Description = "";
		this.Price = 0.0;
		this.Rate = 0;
	}
	
	public void viewInfo() {
		StringBuilder stb = new StringBuilder();
		stb.append("Name: ").append(this.Name).append("\n");
		stb.append("Description: ").append(this.Description).append("\n");
		stb.append("Price: ").append(this.Price).append("\n");
		stb.append("Rate: ").append(this.Rate).append("\n");
		System.out.println(stb.toString());
	}
}
