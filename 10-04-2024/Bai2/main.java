package Bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        MayTinhBoTui mayfx500 = new MayTinhCasioFX500(a, b);
        System.out.println("Cac phep tinh voi may CasioFX500:");
        System.out.println("a + b = " + mayfx500.Cong(a, b));
        System.out.println("a - b = " + mayfx500.Tru(a, b));
        System.out.println("a x b = " + mayfx500.Nhan(a, b));
        System.out.println("a : b = " + mayfx500.Chia(a, b));
        MayTinhBoTui mayVN500MS = new MayTinhCasioFX500(a, b);
        System.out.println("Cac phep tinh voi may VinaCal500MS:");
        System.out.println("a + b = " + mayVN500MS.Cong(a, b));
        System.out.println("a - b = " + mayVN500MS.Tru(a, b));
        System.out.println("a x b = " + mayVN500MS.Nhan(a, b));
        System.out.println("a : b = " + mayVN500MS.Chia(a, b));
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        double []arr = new double[n];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Nhap a["+i+"]:");
            arr[i] = sc.nextDouble();
        }
        SapXepInterface sxChen = new SapXepChen();
        SapXepInterface sxChon = new SapXepChon();
        sxChen.TangDan(arr);
        System.out.println("Sap xep chen: ");
        System.out.println("Sap xep tang: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sxChen.GiamDan(arr);
        System.out.println();
        System.out.println("Sap xep giam: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");
        System.out.println("Sap xep chon: ");
        sxChon.TangDan(arr);
        System.out.println("Sap xep tang: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sxChon.GiamDan(arr);
        System.out.println();
        System.out.println("Sap xep giam: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
	}
}
