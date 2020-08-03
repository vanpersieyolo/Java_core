package Practive;

public class TestRectangle {
    public static void main(String[] args) {
        Rectagle rectagle = new Rectagle();
        System.out.println(rectagle);

        rectagle = new Rectagle(2.0, 4.0);
        System.out.println(rectagle);

//      public Rectagle(double width, double length, String color, boolean filled)
        rectagle = new Rectagle(5.0,6.0," red ",true);
        System.out.println(rectagle);
        System.out.println(rectagle.getArea());
        System.out.println(rectagle.getPerimeter());
    }
}
