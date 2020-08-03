package Excercise4;

public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(){
    }
    public Triangle(double side1, double side2 , double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    public Triangle(String color,double side1, double side2 , double side3 ){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(){
        double a = (Math.sqrt((side1+side3+side2)*(side1+side2-side3)*(side1+side3-side2)))/4;
        return a ;
    }

    @Override
    public String toString() {
        return " side1=" + side1 +
                " side2=" + side2 +
                " side3=" + side3 + super.toString();
    }
}
