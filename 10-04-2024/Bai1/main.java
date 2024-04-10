package Bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron:");
        double r = sc.nextDouble();
        System.out.println("Nhap do dai canh hinh vuong:");
        double s = sc.nextDouble();
        Shape a = new Round(r);
        Shape b = new Square(s);
        a.getArea();
        a.getPerimeter();
        b.getArea();
        b.getPerimeter();
        sc.close();
    }
}
