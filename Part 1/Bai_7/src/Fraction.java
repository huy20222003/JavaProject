import java.util.Scanner;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		this.numerator = 0;
		this.denominator = 0;
	}

	/**
	 * @param numerator
	 * @param denominator
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		if(denominator == 0) {
			System.out.println("Khong the set denominator bang 0");
		} else {
			this.denominator = denominator;
		}
	}
	
	public void InputFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap numerator: ");
		numerator = sc.nextInt();
		System.out.println("Nhap denominator: ");
		denominator = sc.nextInt();
	}
	
	public void OutputFraction() {
		System.out.println("Phan so la: " + numerator + "/" + denominator);
	}
	
	private int findComonDivisor(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		int comonDivisor = a;
		if(a == 0 && b != 0) {
			comonDivisor = b;
		} else if(a != 0 && b == 0) {
			comonDivisor = a;
		} else {
			while(b != 0) {
				int r = a % b;
				a =b;
				b = r;
			}
			comonDivisor = a;
		}
		return comonDivisor;
	}
	
	public Fraction simplifyFraction() {
		int comonDivisor = findComonDivisor(numerator, denominator);
		 	if (numerator == 0 || denominator == 0) {
		        return null;
		 }
		numerator = numerator / comonDivisor;
		denominator = denominator / comonDivisor;
		return new Fraction(numerator, denominator);
	}
	
	public void fractionIverse() {
		int temp = numerator;
		numerator = denominator;
		denominator = temp;
		System.out.println("Phan so sau khi nghich dao la: " + numerator + "/" + denominator);
	}
	
	public Fraction addFraction(Fraction fractionTwo) {
		int newDenominator = this.denominator * fractionTwo.denominator;
		int newNumerator = (this.numerator * fractionTwo.denominator) + (fractionTwo.numerator * this.denominator);
		return new Fraction(newNumerator, newDenominator).simplifyFraction();
	}
	
	public Fraction subtractFraction(Fraction fractionTwo) {
		int newDenominator = this.denominator * fractionTwo.denominator;
		int newNumerator = (this.numerator * fractionTwo.denominator) - (fractionTwo.numerator * this.denominator);
		return new Fraction(newNumerator, newDenominator).simplifyFraction();
	}
	
	public Fraction multiFraction(Fraction fractionTwo) {
		int newDenominator = this.denominator * fractionTwo.denominator;
		int newNumerator = this.numerator * fractionTwo.numerator;
		return new Fraction(newNumerator, newDenominator).simplifyFraction();
	}
	
	public Fraction divideFraction(Fraction fractionTwo) {
		int newDenominator = this.denominator * fractionTwo.numerator;
		int newNumerator = this.numerator * fractionTwo.denominator;
		return new Fraction(newNumerator, newDenominator).simplifyFraction();
	}
}
