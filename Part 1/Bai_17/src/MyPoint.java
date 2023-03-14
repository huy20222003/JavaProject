
public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * @param x
	 * @param y
	 */
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public float distance (int x, int y) {
		return (float) Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}
	
	public float distance (MyPoint point1) {
		return (float ) Math.sqrt(Math.pow(point1.x - this.x, 2) + Math.pow(point1.y - this.y, 2));
	}
	
}
