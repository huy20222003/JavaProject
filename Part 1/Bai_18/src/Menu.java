import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Shop sh = new Shop();
		int k;
		
		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Add Product");
			System.out.println("2. Remove Product");
			System.out.println("3. View Product");
			System.out.println("4. Search Product");
			System.out.println("5. Sort Product");
			System.out.println("0. Exit");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Input Request: ");
			k = sc.nextInt();
			sc.nextLine();
			
			switch(k) {
			case 1: 
				
				sh.addProduct();
				break;
			case 2: 
				sh.removeProduct();
				break;
			case 3: 
				sh.iterateProductList();
				break;
			case 4: 
				sh.searchProduct();
				break;
			case 5:
				sh.sortProduct();
				break;
			case 0:
				System.out.println("-----Exit successfull-----");
				break;
			default:
				System.out.println("-----Request invalid!-----");
				break;
			}
		} while(k >= 1 && k <= 6);
		
	}

}
