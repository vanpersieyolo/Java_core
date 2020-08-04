package Practive3;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.0);
        System.out.println(square);
//
        square = new Square(4.5," red ", true);
        System.out.println(square);

        square.setSide(5.6);
        System.out.println(square);
    }
}
