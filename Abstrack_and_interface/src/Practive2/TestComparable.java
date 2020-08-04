package Practive2;

import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "red",false);

        System.out.println("pre - sorted: ");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("After - sorted: ");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}
