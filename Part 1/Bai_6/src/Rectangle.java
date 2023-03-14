import java.util.Scanner;

public class Rectangle {
	private float width, length;

	/**
	 * @param width
	 * @param length
	 */
	public Rectangle() {
		this.length = 0.0f;
		this.width = 0.0f;
	}
	
	public Rectangle(float width, float length) {
		this.width = width;
		this.length = length;
	}
	
	public void InputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai cua hinh chu nhat: ");
		length =sc.nextFloat();
		System.out.println("Nhap chieu rong cua hinh chu nhat: ");
		width = sc.nextFloat();
		sc.close();
	}
	
	public void getArea() {
		float area = 0.0f;
		area = length * width;
		System.out.println("Dien tich cua hinh chu nhat la: " + area);
	}
	
	public void getPerimeter() {
		float perimeter = 0.0f;
		perimeter = (length + width) * 2;
		System.out.println("Chu vi cua hinh chu nhat la: " + perimeter);
	}
	
}
