package Abstract;

import java.util.Scanner;

public abstract class DienThoai {
    Scanner sc = new Scanner(System.in);
    public abstract void themDienThoai(String hoTen, String soDienThoai);
    public abstract void xoaDienThoai(String hoTen );
    public abstract void capNhatDienThoai(String hoTen, String soDTMoi);
    public abstract void timDienThoai(String hoTen);
    public abstract void sapXep();
}