package Bai2;

public class SapXepChen implements SapXepInterface {

    @Override
    public void TangDan(double[] a) {
        int n = a.length;
		double tg;
		int i, j;
		for (i = 1; i < n; i++) {
			tg = a[i];
			j = i - 1;

			while (j >= 0 && a[j] > tg) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = tg;
		}
    }

    @Override
    public void GiamDan(double[] b) {
        int n = b.length;
		double tg;
		int i, j;
		for (i = 1; i < n; i++) {
			tg = b[i];
			j = i - 1;

			while (j >= 0 && b[j] < tg) {
				b[j + 1] = b[j];
				j = j - 1;
			}
			b[j + 1] = tg;
		}
    }
}
