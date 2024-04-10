package Bai2;

public class SapXepChon implements SapXepInterface {

    @Override
    public void TangDan(double[] a) {
        int n = a.length;
		int i, j, min;
		for (i = 0; i < n - 1; i++) {
			min = i;
			for (j = i + 1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			double tg = a[min];
			a[min] = a[i];
			a[i] = tg;
		}
    }

    @Override
    public void GiamDan(double[] b) {
        int n = b.length;
		int i, j, min;
		for (i = 0; i < n - 1; i++) {
			min = i;
			for (j = i + 1; j < n; j++)
				if (b[j] > b[min])
					min = j;
			double tg = b[min];
			b[min] = b[i];
			b[i] = tg;
		}
    }
    
}
