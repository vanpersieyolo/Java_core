package Practive;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){
    }

    public  Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, boolean filled, String color ){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return  radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
