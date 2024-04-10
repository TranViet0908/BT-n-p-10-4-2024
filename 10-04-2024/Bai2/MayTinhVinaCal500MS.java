package Bai2;

public class MayTinhVinaCal500MS implements MayTinhBoTui{
    private double a, b;
    public MayTinhVinaCal500MS(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Cong(double a, double b) {
        return a + b;
    }

    @Override
    public double Tru(double a, double b) {
        return a - b;
    }

    @Override
    public double Nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double Chia(double a, double b) {
        return a / b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
}
