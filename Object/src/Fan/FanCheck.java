package Fan;

public class FanCheck  {

    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.getOn();
        System.out.println(fan1.getOn());

//    fan1.setSpeed(fan1.FAST);
//    fan1.getSpeed();
//    fan1.setRadius(10);
//    fan1.getRadius();
//    fan1.setColor("yellow");
//    fan1.getRadius();
//    fan1.setOn(true);
//    fan1.getOn();

//
        System.out.println(fan1.toString());
    }
}