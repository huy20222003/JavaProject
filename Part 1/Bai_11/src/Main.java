
public class Main {

	public static void main(String[] args) {
		Matrix mt = new Matrix();
	    Matrix mt1 = new Matrix();
	    
	    System.out.println("Input matrix 1: ");
	    mt.inputMatrix();
	    mt.showMatrix();
	    
	    System.out.println("Input matrix 2: ");
	    mt1.inputMatrix();
	    mt1.showMatrix();
	    
	    System.out.println("Total of 2 matrix is: ");
	    Matrix sum = mt.addMatrix(mt1);    
	    sum.showMatrix();
	    
	    System.out.println("Multi of 2 matrix is: ");
	    Matrix multi = mt.multiMatrix(mt1);    
	    multi.showMatrix();
	}

}
