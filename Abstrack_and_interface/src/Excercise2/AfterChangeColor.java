package Excercise2;

public class AfterChangeColor {
    public static void main(String[] args) {
        Shape[] shs = new Shape[3];
        shs[0] = new Circle();
        shs[1] = new Rectangle();
        shs[2] = new Square();

        for ( Shape shape : shs) {
            if (shape instanceof Circle){
                System.out.println("before change color" + shape.toString());
                ((Circle) shape).howtoColor();
                System.out.println("After change color " + shape.toString());
            } else if (shape instanceof Square){
                System.out.println("before change color" + shape.toString());
                ((Square) shape).howtoColor();
                System.out.println("After change color " + shape.toString());
            }else if (shape instanceof Rectangle){
                System.out.println("before change color" + shape.toString());
                ((Rectangle) shape).howtoColor();
                System.out.println("After change color " + shape.toString());
            }
        }
    }
}
