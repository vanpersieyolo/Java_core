package Excercise3;

import org.w3c.dom.ls.LSOutput;

public class TestMovePoint {
    public static void main(String[] args) {
       MovePoint movePoint = new MovePoint();
       System.out.println(movePoint);

       movePoint = new MovePoint(5.0,6.0);
       System.out.println(movePoint);

       movePoint = new MovePoint(1.0,2.0,3.0,4.0);
        System.out.println(movePoint);

        movePoint.setXY(10.0,11.0);
        System.out.println(movePoint);

    }
}
