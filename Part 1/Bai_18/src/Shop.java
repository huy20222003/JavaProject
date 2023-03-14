import java.util.*;

public class Shop {
	ArrayList<Product> ProductList = new ArrayList<Product>();
	
	public Shop() {}
	
	public void addProduct(Product pr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Name: ");
		pr.Name = sc.nextLine();
		System.out.println("Input Description: ");
		pr.Description = sc.nextLine();
		System.out.println("Input Price: ");
		pr.Price = sc.nextDouble();
		System.out.println("Input Rate: ");
		pr.Rate = sc.nextInt();
		
		ProductList.add(pr);
	}
	
	public void removeProduct() {
		
	}
	
}
