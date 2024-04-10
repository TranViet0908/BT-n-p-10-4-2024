package Bai1;

public class Round implements Shape {
    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double s  = 3.14*this.radius*this.radius;
        System.out.println("Dien tich hinh tron: " + s);
    }

    @Override
    public void getPerimeter() {
        double p = 3.14*this.radius;
        System.out.println("Chu vi hinh tron: " + p);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
