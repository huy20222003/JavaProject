
public class Main {

	public static void main(String[] args) {
		Vector vt1 = new Vector(1, 2, 3, 4);
		Vector vt2 = new Vector(5, 6, 7, 8);
		
		vt1.checkVector(vt2);
		
		Vector sum = vt1.addVector(vt2);
		System.out.println("Tong hai vector la: (" + sum.getHeadSpan() + ", " + sum.getEndSpan() + ", " + sum.getHeadAltitude() + ", " + sum.getEndAltitude() + ")");
		
		Vector sub = vt1.substractVector(vt2);
		System.out.println("Hieu hai vector la: (" + sub.getHeadSpan() + ", " + sub.getEndSpan() + ", " + sub.getHeadAltitude() + ", " + sub.getEndAltitude() + ")");
		
		System.out.println("Module cua vector la: " + vt1.vectorModule());
		
		System.out.println("Goc giua hai vector la: " + vt1.gocVector(vt2));
	}

}
