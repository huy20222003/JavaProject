
public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint mp = new MyPoint(1, 2);
		MyPoint mp1 = new MyPoint(2, 3);
		
		System.out.println("Point is: " + mp.toString());
		System.out.println("Khoang cach giua hai diem la: " + mp.distance(2, 3));
		System.out.println("Khoang cach giua hai diem la: " + mp.distance(mp1));
	}

}
