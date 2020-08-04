package ExcerciseOne;

public class AfterResize {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for ( Shape shape: shapes) {
            if (shape instanceof Circle){
                System.out.println("Before Circle: "+shape.toString());
                ((Circle) shape).reszie(Math.random());
                System.out.println("After Circle: "+shape.toString());
            }else if (shape instanceof Square){
                System.out.println("Before Square: "+shape.toString());
                ((Square) shape).reszie(Math.random()*100+1);
                System.out.println("After Square: "+shape.toString());
            }else {
                System.out.println("Before Rect: "+shape.toString());
                ((Rectangle) shape).reszie(Math.random()*100+1);
                System.out.println("After Rect: "+shape.toString());
            }

        }
    }

}
