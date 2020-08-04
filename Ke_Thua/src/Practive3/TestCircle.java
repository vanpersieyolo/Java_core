package Practive3;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.5);
        System.out.println(circle);

//        public Circle(double radius, boolean filled, String color )
        circle = new Circle(2.5,true,"indigo");
        System.out.println(circle);
        System.out.println(circle.getArea() + " and " + circle.getPerimeter()   );
    }
}
