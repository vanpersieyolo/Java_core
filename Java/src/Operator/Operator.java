package Operator;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter W: ");
        width = scanner.nextFloat();
        System.out.println("Enter H: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area = "  + area);
    }
}
