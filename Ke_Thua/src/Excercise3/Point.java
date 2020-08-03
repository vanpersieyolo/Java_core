package Excercise3;

public class Point {
    double x = 0.0;
    double y = 0.0;

    public Point(){
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY(){
        double[] showXY = {x,y};
        return showXY;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " x= " + x + " y= " + y ;
    }
}
