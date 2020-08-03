package Excercise2;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D.setXY(5.0f, 6.0f);
        System.out.println(point2D);

        for (float a : point2D.getXY()) {
            System.out.println(a);
        }
        point2D.setXY(9.0f,5.0f);
        for (float b:
             point2D.getXY()) {
            System.out.println();
        }


    }
}
