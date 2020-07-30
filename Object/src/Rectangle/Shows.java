package Rectangle;

import java.util.Scanner;

public class Shows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào cạnh dài: ");
        double width = scanner.nextDouble();
        System.out.println("nhập vào cạnh rộng: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("chu vi là : "+ rectangle.getPrimete());
        System.out.println("diện tích là: "+ rectangle.getArea());
        System.out.println(rectangle.display());
    }
}
