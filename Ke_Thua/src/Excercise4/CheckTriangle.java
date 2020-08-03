package Excercise4;

public class CheckTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        System.out.println(triangle.getArea());
        triangle = new Triangle("blue",4.0,5.0,6.0);

        System.out.println(triangle);
        System.out.println(triangle.getArea());
    }
}
