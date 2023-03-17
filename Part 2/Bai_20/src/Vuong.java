
public class Vuong extends ChuNhat{

	public Vuong(int dai, int rong) {
		super(dai, rong);
	}

	@Override
	public void xuat() {
		System.out.println("Canh hinh vuong la: " + dai);
		System.out.println("Chu vi hinh vuong la: " + getChuVi());
		System.out.println("Dien tich hinh vuong la: " + getDienTich());
	}

}
