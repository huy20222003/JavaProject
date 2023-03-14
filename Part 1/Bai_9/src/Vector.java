
public class Vector {
	private float headSpan;
	private float endSpan;
	private float headAltitude;
	private float endAltitude;
	
	/**
	 * @param headSpan
	 * @param headAltitude
	 * @param endSpan
	 * @param endAltitude
	 */
	public Vector(float headSpan, float endSpan, float headAltitude, float endAltitude) {
		this.headSpan = headSpan;
		this.headAltitude = headAltitude;
		this.endSpan = endSpan;
		this.endAltitude = endAltitude;
	}
	
	/**
	 * @return the headSpan
	 */
	public float getHeadSpan() {
		return headSpan;
	}

	/**
	 * @param headSpan the headSpan to set
	 */
	public void setHeadSpan(float headSpan) {
		this.headSpan = headSpan;
	}

	/**
	 * @return the headAltitude
	 */
	public float getHeadAltitude() {
		return headAltitude;
	}

	/**
	 * @param headAltitude the headAltitude to set
	 */
	public void setHeadAltitude(float headAltitude) {
		this.headAltitude = headAltitude;
	}

	/**
	 * @return the endSpan
	 */
	public float getEndSpan() {
		return endSpan;
	}

	/**
	 * @param endSpan the endSpan to set
	 */
	public void setEndSpan(float endSpan) {
		this.endSpan = endSpan;
	}

	/**
	 * @return the endAltitude
	 */
	public float getEndAltitude() {
		return endAltitude;
	}

	/**
	 * @param endAltitude the endAltitude to set
	 */
	public void setEndAltitude(float endAltitude) {
		this.endAltitude = endAltitude;
	}

	public void checkVector(Vector vt) {
		if(this.headSpan == vt.headSpan && this.headAltitude == vt.headAltitude && this.endSpan == vt.endSpan && this.endAltitude == vt.endAltitude) {
			System.out.println("Hai vector bang nhau");
		} else {
			System.out.println("Hai vector khong bang nhau");
		}
	} 
	
	public Vector addVector(Vector vt) {
		float newHeadSpan = this.headSpan + vt.headSpan;
		float newEndSpan = this.endSpan + vt.endSpan;
		float newHeadAltitude = this.headAltitude + vt.headAltitude;
		float newEndAltitude = this.endAltitude + vt.endAltitude;
		
		return new Vector(newHeadSpan, newEndSpan, newHeadAltitude, newEndAltitude);
	}
	
	public Vector substractVector(Vector vt) {
		float newHeadSpan = this.headSpan - vt.headSpan;
		float newEndSpan = this.endSpan - vt.endSpan;
		float newHeadAltitude = this.headAltitude - vt.headAltitude;
		float newEndAltitude = this.endAltitude - vt.endAltitude;
		
		return new Vector(newHeadSpan, newEndSpan, newHeadAltitude, newEndAltitude);
	}
	
	public float vectorModule() {
		float module = (float) Math.sqrt(Math.pow(this.endSpan - this.headSpan, 2) + Math.pow(this.endAltitude - this.headAltitude, 2));
		return module;
	}
	
	public float gocVector(Vector vt) {
		float goc = (float) Math.cos((((this.endSpan - this.headSpan) * (vt.endSpan - vt.headSpan)) + ((this.endAltitude - this.headAltitude) * (vt.endAltitude - vt.headAltitude))) / (this.vectorModule() * vt.vectorModule()));
		return goc;
	}
	
}
