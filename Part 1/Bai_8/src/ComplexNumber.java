
public class ComplexNumber {
	private float realPart;
	private float imaginaryPart;
	/**
	 * @param realPart
	 * @param imaginaryPart
	 */
	public ComplexNumber(float realPart, float imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	/**
	 * @return the realPart
	 */
	public float getRealPart() {
		return realPart;
	}



	/**
	 * @param realPart the realPart to set
	 */
	public void setRealPart(float realPart) {
		this.realPart = realPart;
	}



	/**
	 * @return the imaginaryPart
	 */
	public float getImaginaryPart() {
		return imaginaryPart;
	}



	/**
	 * @param imaginaryPart the imaginaryPart to set
	 */
	public void setImaginaryPart(float imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}



	public void showComplexNumber() {
		System.out.println("So phuc la: " + realPart + imaginaryPart + "i");
	}
	
	public ComplexNumber addComplexNumber(ComplexNumber cn) {
		float newRealPart = this.realPart + cn.realPart;
		float newImaginaryPart = this.imaginaryPart + cn.imaginaryPart;
		return new ComplexNumber(newRealPart, newImaginaryPart);
	}
	
	public ComplexNumber subtractComplexNumber(ComplexNumber cn) {
		float newRealPart = this.realPart - cn.realPart;
		float newImaginaryPart = this.imaginaryPart - cn.imaginaryPart;
		return new ComplexNumber(newRealPart, newImaginaryPart);
	}
	
	public ComplexNumber multiComplexNumber(ComplexNumber cn) {
		float newRealPart = (this.realPart * cn.realPart) - (this.imaginaryPart * cn.imaginaryPart);
		float newImaginaryPart = (this.realPart * cn.imaginaryPart) + (this.imaginaryPart * cn.realPart);
		return new ComplexNumber(newRealPart, newImaginaryPart);
	}
	
	public ComplexNumber divideComplexNumber(ComplexNumber cn) {
		float denominator = (float) (Math.pow(cn.realPart, 2) + Math.pow(cn.imaginaryPart, 2));
		float newRealPart = (this.realPart * cn.realPart + this.imaginaryPart * cn.imaginaryPart) / denominator;
		float newImaginaryPart = (this.imaginaryPart * cn.realPart - this.realPart * cn.imaginaryPart) / denominator;
		return new ComplexNumber(newRealPart, newImaginaryPart);
	}
	
}
