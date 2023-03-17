import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
	ArrayList<Product> ProductList;
	
	public Shop() {
		this.ProductList = new ArrayList<Product>();
	}
	
	/**
	 * @param productList
	 */
	public Shop(ArrayList<Product> productList) {
		this.ProductList = productList;
	}
	

	public void addProduct() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter product name:");
	    String name = sc.nextLine();
	    System.out.println("Enter product description:");
	    String description = sc.nextLine();
	    double price;
	    do {
	        System.out.println("Enter product price (0 < price <= 100):");
	        price = sc.nextDouble();
	    } while (price <= 0 || price > 100);
	    int[] rate = new int[5];
	    System.out.println("Enter a array number between 1-5:");
	    for(int i = 0; i < 5; i++) {
	    	System.out.print("Enter rate " + i);
	        rate[i] = sc.nextInt();
	        while (rate[i] < 1 || rate[i] > 5) {
	            System.out.println("Invalid rating, please enter a number between 1-5:");
	            rate[i] = sc.nextInt();
	        }
	    }
	    ProductList.add(new Product(name, description, price, rate));
	    System.out.println("Product added successfully.");
	}
	
	public void removeProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Name: ");
		String nameRemove = sc.nextLine();
		int size = ProductList.size();
		
		for(int i = 0; i < size; i++) {
			if(ProductList.get(i).getName().equals(nameRemove)) {
				ProductList.remove(i);
				System.out.println("-----Remove sucessfull!-----");
			}
		}
	}
	
	public void iterateProductList() {
		int size = ProductList.size();
		
		if(ProductList.isEmpty()) {
			System.out.println("Productlist is empty");
		} else {
			System.out.printf("|%12s|%20s|%10s|%10s|\n", "Name", "Description", "Price", "Rate");
			for(int i = 0; i < size; i++) {
				ProductList.get(i).viewInfo();
				System.out.printf("%10.1f|\n", ProductList.get(i).getAverageRate());
			}
		}
	}
	
	public void searchProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input min price: ");
		double minPrice = sc.nextDouble();
		System.out.println("Input max price: ");
		double maxPrice = sc.nextDouble();
		
		int size = ProductList.size();
		System.out.printf("|%12s|%20s|%10s|%10s|\n", "Name", "Description", "Price", "Rate");
		for(int i = 0; i < size; i++) {
			if(ProductList.get(i).getPrice() >= minPrice && ProductList.get(i).getPrice() <= maxPrice) {
				ProductList.get(i).viewInfo();
				System.out.printf("%10.1f|\n", ProductList.get(i).getAverageRate());
				break;
			}
		}	
	}
	
	public void sortProduct() {
		int size = ProductList.size();
		
		if(ProductList.isEmpty()) {
			System.out.println("Productlist is empty");
		} else {
			for(int i = 0; i < size; i++) {
				for(int j = i + 1; j < size; j++) {
					if(ProductList.get(i).getPrice() > ProductList.get(j).getPrice()) {
						Product pr = ProductList.get(i);
						ProductList.set(i, ProductList.get(j));
						ProductList.set(j, pr);
					}
				}
			}
			System.out.println("Sort Product Done!");
		}
	}
	
}
