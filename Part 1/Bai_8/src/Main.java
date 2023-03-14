
public class Main {

	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber(2, 3);
		ComplexNumber cn2 = new ComplexNumber(3, 4);
		
		ComplexNumber sum =  cn1.addComplexNumber(cn2);
		System.out.println("Tong cua hai so phuc la: " + sum.getRealPart() + " + " + sum.getImaginaryPart() + "i");
		
		ComplexNumber sub =  cn1.subtractComplexNumber(cn2);
		System.out.println("Hieu cua hai so phuc la: " + sub.getRealPart() + " + " + sub.getImaginaryPart() + "i");
		
		ComplexNumber multi =  cn1.multiComplexNumber(cn2);
		System.out.println("Tich cua hai so phuc la: " + multi.getRealPart() + " + " + multi.getImaginaryPart() + "i");
		
		ComplexNumber divide =  cn1.divideComplexNumber(cn2);
		System.out.println("Thuong cua hai so phuc la: " + divide.getRealPart() + " + " + divide.getImaginaryPart() + "i");
	}

}
