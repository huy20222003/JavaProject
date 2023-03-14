
public class SoNguyenTo {
	private int a;
	
	public SoNguyenTo() {
		this.a = 1;
	}

	/**
	 * @param a
	 */
	public SoNguyenTo(int x) {
		if(isSoNguyenTo(x)) {
			this.a = x;
		} else {
			System.out.println(x + " khong phai so nguyen to, khong luu tru");
		}
	}
	
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int x) {
		if(isSoNguyenTo(x)) {
			this.a = x;
		} else {
			System.out.println("Khong set");
		}
	}
	
	boolean isSoNguyenTo(int x) {
		if(x < 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x % i == 0) {
				return false;
			}
		} 
		return true;
	}
	
	public int timSoNguyenToTiepTheo() {
		int x = a;
		if(x % 2 != 0) {
			x+=2;
		} else {
			x++;
		}
		while(isSoNguyenTo(x) == false);
		
		return x;
	}
}
