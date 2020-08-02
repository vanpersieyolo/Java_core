package ExcerciseAccessModifier;

public class Circle {
    protected double radius = 1.0;
    protected String color ="red";


    protected void setRadius(double x){
        this .radius = x;
    }

    protected double getRadius() {
        return radius;
    }
    protected double getArea(){
        return radius * Math.PI;
    }

}
