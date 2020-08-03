package Excercise4;

public class Shape {
    protected String color  = " red";
    public Shape(){
    }
    public Shape(String color){
        this.color = color;
    }

    protected void setColor(String color) {
        this.color = color;
    }
    protected String getColor(){
        return getColor();
    }

    @Override
    public String toString() {
        return " color= " + color ;
    }
}
