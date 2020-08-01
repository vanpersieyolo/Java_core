package Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    boolean on ;
    private int speed = SLOW;
    private int radius = 5;
    private String color = "blue";

    public boolean getOn() {
        if (on == true){
            System.out.println("status: ON");
        }else {
            System.out.println("status: Off");
        }
        return on;
    }
    public void setOn(boolean x)
    {
        this.on = true;

    }
    public  int getSpeed(){
        return speed;
    }
    public  void setSpeed( int x){
        this.speed = x;
    }
    public  int getRadius(){
        return radius;
    }
    public  void setRadius(int a){
        this.radius = a;
    }
    public  String getColor(){
        return color;
    }
    public  void setColor(String string){
        this.color = string;
    }

    @Override
    public String toString() {
        if (this.on)
        return "Fan{" +
                ", on=" + on +
                ", speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
        else return
                        ", speed=" + speed +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
    }
}
