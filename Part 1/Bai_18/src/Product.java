
public class Product {
	private String Name;
	private String Description;
	private double Price;
	private int[] Rate;
	
	public Product() {
	}
	
	public Product(String Name, String Description, double Price, int[] Rate) {
		this.Name =  Name;
		this.Description = Description;
		this.Price = Price;
		this.Rate = Rate;
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
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
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
	 * @return the rate
	 */
	public int[] getRate() {
		return Rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(int[] rate) {
		Rate = rate;
	}


	public void viewInfo() {
		System.out.printf("|%12s|%20s|%10.3f|", this.Name, this.Description, this.Price);	
	}
	
	public double getAverageRate() {
	    int sum = 0;
	    for (int i = 0; i < Rate.length; i++) {
	        sum += Rate[i];
	    }
	    return (double) sum / Rate.length;
	}
}
