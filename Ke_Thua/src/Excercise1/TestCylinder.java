package Excercise1;

import org.w3c.dom.ls.LSOutput;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        cylinder.setHeight(5.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
