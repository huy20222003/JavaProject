import java.util.Scanner;

public class Matrix {
	private int row;
	private int col;
	private int[][] mt;
	
	public Matrix() {
	}
	
	public Matrix(int row, int col) {
	     this.row = row;
	     this.col = col;
	     mt = new int[row][col];
	   }
	   
	
	public void inputMatrix() {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter row matrix: ");
	     row = sc.nextInt();
	     System.out.println("Enter col matrix: ");
	     col = sc.nextInt();
	     mt = new int[row][col];
	     for(int i = 0; i < this.row; i++) {
	       for(int j = 0; j < this.col; j++) {
	         System.out.print("Enter mt[" + i + "][" + j + "] = ");
	         mt[i][j] = sc.nextInt();
	       }
	     }
	   }
	   
	   public void showMatrix() {
	     System.out.println("List item of array: ");
	     for(int i = 0; i < this.row; i++) {
	       for(int j = 0; j < this.col; j++) {
	         System.out.print(mt[i][j] + " ");
	       }
	       System.out.print("\n");
	     }
	   }
	   
	   public Matrix addMatrix(Matrix mt1) {
	     Matrix mt2 = new Matrix(row, col);
	     if(this.row != mt1.row || this.col != mt1.col) {
	    	 System.out.println("Can't add 2  matrixs");
	     }
	     for(int i = 0; i < this.row; i++) {
	       for(int j = 0; j < this.col; j++) {
	         mt2.mt[i][j] = this.mt[i][j] + mt1.mt[i][j];
	       }
	     }
	     return mt2;
	   }
	   
	   public Matrix multiMatrix(Matrix mt1) {
		     Matrix mt2 = new Matrix(this.row, mt1.col);
		     if(this.row != mt1.col || this.col != mt1.row) {
		    	 System.out.println("Can't multi 2 matrixs");
		     } else {
		    	 for(int i = 0; i < this.row; i++) {
				     for(int j = 0; j < mt1.col; j++) {
				        for(int k = 0; k < this.col; k++) {
				        	 mt2.mt[i][j] += this.mt[i][k] * mt1.mt[k][j];
				        }
				     }
				  }
		     }
		     return mt2;
		   }
}
