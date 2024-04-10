package Bai2;

public class PhanMemMayTinh implements MayTinhBoTui, SapXepInterface{

	@Override
	public double Cong(double a, double b) {
		return a+b;
	}

	@Override
	public double Tru(double a, double b) {
		return a-b;
	}

	@Override
	public double Nhan(double a, double b) {
		return a*b;
	}

	@Override
	public double Chia(double a, double b) {
		return a/b;
	}
	
	@Override
	public void TangDan (double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void GiamDan(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
