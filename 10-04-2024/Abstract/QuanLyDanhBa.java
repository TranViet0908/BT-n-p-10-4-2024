package Abstract;

import java.util.Scanner;

public class QuanLyDanhBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhBa QLDB = new DanhBa();
        boolean menu = true;
        while (menu) {
        System.out.println("Open Menu: ");
        System.out.println(
                "1. Them (themDienThoai)\n2. Sua (capNhatDienThoai)\n3. Xoa (xoaDienThoai)\n4. Tim kiem (timDienThoan)\n5. Sap xep (sort)\n6. Thoat");
        System.out.println("Nhap chuong trinh ban su dung: ");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        System.out.println("Them Dien thoai:");
                        System.out.println("Nhap Ho ten: ");
                        String hoTen = sc.nextLine();
                        System.out.println("Nhap SDT: ");
                        String SDT = sc.nextLine();
                        QLDB.themDienThoai(hoTen, SDT);
                        break;
                    }
                    case 2: {
                        System.out.println("Sua SDT:");
                        System.out.println("Nhap Ho ten: ");
                        String hoTen = sc.nextLine();
                        System.out.println("Nhap SDT moi: ");
                        String SDT = sc.nextLine();
                        QLDB.capNhatDienThoai(hoTen, SDT);
                        break;
                    }
                    case 3: {
                        System.out.println("Xoa SDT:");
                        System.out.println("Nhap Ho ten: ");
                        String hoTen = sc.nextLine();
                        QLDB.xoaDienThoai(hoTen);
                        break;
                    }
                    case 4: {
                        System.out.println("Tim kiem SDT:");
                        System.out.println("Nhap Ho ten: ");
                        String hoTen = sc.nextLine();
                        QLDB.timDienThoai(hoTen);
                        break;
                    }
                    case 5: {
                        System.out.println("Sap xet SDT theo ten:");
                        QLDB.sapXep();
                        QLDB.output();
                        break;
                    }
                    case 6: {
                        System.out.println("Ban da thoat khoi menu!");
                        menu = false;
                        break;
                    }
                    default:
                        System.out.println("Khong co chuong trinh nay. Vui long chon lai chuong trinh!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Chuong trinh xay ra loi! Vui long chon lai");
            }
        }
        sc.close();
    }
}
