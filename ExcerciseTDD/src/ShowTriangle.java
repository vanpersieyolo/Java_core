import java.util.Scanner;

public class ShowTriangle {
    public static void main(String[] args) {
        int firstSide = 0;
        int secondSide = 0;
        int thirdSide = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào cạnh a: ");
        firstSide = scanner.nextInt();
        System.out.println("nhập vào cạnh b: ");
        secondSide = scanner.nextInt();
        System.out.println("nhập vào cạnh c: ");
        thirdSide = scanner.nextInt();

        ExcerciseTriangle excerciseTriangle = new ExcerciseTriangle();

        excerciseTriangle.checkTriangleType(firstSide,secondSide,thirdSide);
    }
}
