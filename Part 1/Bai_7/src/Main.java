
public class Main {

	public static void main(String[] args) {
		Fraction fr1 = new Fraction();
		Fraction fr2 = new Fraction();
		
		fr1.InputFraction();
		fr2.InputFraction();
		fr1.OutputFraction();
		fr2.OutputFraction();
		Fraction sum = fr1.addFraction(fr2);
		System.out.println("Tong cua hai phan so la: " + sum.getNumerator() + "/" + sum.getDenominator());
		Fraction sub = fr1.subtractFraction(fr2);
		System.out.println("Hieu cua hai phan so la: " + sub.getNumerator() + "/" + sub.getDenominator());
		Fraction multi = fr1.multiFraction(fr2);
		System.out.println("Tich cua hai phan so la: " + multi.getNumerator() + "/" + multi.getDenominator());
		Fraction divide = fr1.divideFraction(fr2);
		System.out.println("Thuong cua hai phan so la: " + divide.getNumerator() + "/" + divide.getDenominator());
	}

}
