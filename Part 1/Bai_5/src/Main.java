
public class Main {

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		System.out.println("Nhap thong tin cua tam giac");
		tr.InputInfo();
		System.out.println("Kieu tam giac la: " + tr.getType());
		tr.getPerimeter();
		tr.getArea();
	}

}
