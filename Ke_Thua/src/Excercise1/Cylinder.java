package Excercise1;

public class Cylinder extends Circle {
    double height = 4.0;

    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "height = " + height + super.toString();
    }
}
