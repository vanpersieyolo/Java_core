package Rectangle;

public class Rectangle {
    double height,width;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return (this.height * this.width);
    }
    public double getPrimete(){
        return (this.width + this.height) * 2 ;
    }
    public  String display(){
        return "Rectangle{"+"width =" + width + "__height = "+height+"}";
    }

}

