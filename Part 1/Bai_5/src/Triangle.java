import java.util.Scanner;

public class Triangle {
	
	private float a, b, c;

	public Triangle() {
		this.a = 0.0f;
		this.b = 0.0f;
		this.c = 0.0f;
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * @return the a
	 */
	public float getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(float a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public float getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(float b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public float getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(float c) {
		this.c = c;
	}
	
	public void InputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai canh thu nhat: ");
		a = sc.nextFloat();
		System.out.println("Nhap do dai canh thu hai: ");
		b = sc.nextFloat();
		System.out.println("Nhap do dai canh thu ba: ");
		c = sc.nextFloat();
		sc.close();
	}
	
	public String getType() {
		if(a <= 0 || b <= 0 || c <= 0) {
			return "Khong phai tam giac";
		} else if(a + b <= c || b + c  <= a || a + c <= b) {
			return "Khong phai tam giac";
		} else if(a == b && a == c) {
			return "Tam giac deu";
		} else if(a == b || a ==c || b == c) {
			return "Tam giac can";
		} else if((c * c) == (a * a) + (b * b)) {
			return "Tam giac vuong";
		} else {
			return "Tam giac thuong";
		}
	}
	
	public void getPerimeter() {
		String type = getType();
		float perimeter = 0.0f;
		
		if(type == "Khong phai tam giac") {
			System.out.println("Khong the tinh duoc chu vi");
		} else {
			perimeter = a + b +c;
			System.out.println("Chu vi cua tam giac la: " + perimeter);
		}
	}
	
	public void getArea() {
		String type = getType();
		float p = (a + b + c) / 2;
		float area = 0.0f;
		
		if(type == "Khong phai tam giac") {
			System.out.println("Khong the tinh duoc dien tich");
		} else {
			area = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("Dien tich cua tam giac la: " + area);
		}
	}
	
}
