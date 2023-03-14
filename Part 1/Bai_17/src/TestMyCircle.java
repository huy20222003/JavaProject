
public class TestMyCircle {

	public static void main(String[] args) {
		MyPoint mp = new MyPoint(1, 2);
		MyCircle mc = new MyCircle(mp, 2);
		
		
		System.out.println(mc.toString());
		System.out.println("Area is: " + mc.getArea());
	}

}
