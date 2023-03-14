
public class MyCircle{
	private int r;
	private MyPoint mp;
	
	public MyCircle(int x, int y, int r) {
		mp = new MyPoint(x, y);
	}
	
	public MyCircle(MyPoint mp, int r) {
		this.mp = mp;
		this.r = r;
	}

	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * @return the mp
	 */
	public MyPoint getMp() {
		return mp;
	}

	/**
	 * @param mp the mp to set
	 */
	public void setMp(MyPoint mp) {
		this.mp = mp;
	}
	
	public void setMpXY(int x, int y) {
		mp.setXY(x, y);
	}
	
	public String toString() {
		return "Hinh tron @(" + mp.getX() + ", " + mp.getY() + ") ban kinh = " + r;
	}
	
	public float getArea() {
		return (float) (Math.PI * Math.pow(this.r, 2));
	}
	
}
