package ExcerciseOne;

import java.awt.*;

public class Rectangle extends Shape implements Resizeable {
    protected double width = 1.0;
    protected double length = 5.0;

    @Override
    public void reszie(double percent) {
       this.length = this.length * percent;
       this.width = this.width * percent;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return getWidth() +"__"+ getLength() +"__"+ super.toString();
    }
}

