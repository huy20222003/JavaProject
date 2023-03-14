
public class Ellipsoid extends Polygonal {

	public Ellipsoid(float width, float length) {
		super(width, length);
	}
	
	public float getPerimeter() {
		return (this.width + this.length) * 2;
	}
	
	public float getArea() {
		return 0;
	}
	
}
