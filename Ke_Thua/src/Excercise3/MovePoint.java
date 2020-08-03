package Excercise3;

public class MovePoint extends Point {
    public double xSpeed = 0.0;
    public double ySpeed = 0.0;

    public MovePoint(){
    }
    public MovePoint(double x, double y, double xSpeed, double ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovePoint(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public double[] getSpeed(){
        double[] showSpeed = {x,y};
        return showSpeed;
    }

    @Override
    public void setXY(double x, double y) {
        super.setXY(x, y);
    }

    @Override
    public String toString() {
        return " xSpeed= " + xSpeed + " ySpeed= " + ySpeed + super.toString();

    }
}
