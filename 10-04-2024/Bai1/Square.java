package Bai1;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public void getArea(){
        double s = this.side * this.side;
        System.out.println("Dien tich hinh vuong: " + s);

    }
    @Override
    public void getPerimeter(){
        double p = this.side * 4;
        System.out.println("Chu vi hinh vuong: " + p);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}