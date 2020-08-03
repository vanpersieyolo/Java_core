package TestSkill;

public class Dog extends  Animal{
    int height = 0;
    public void method(){
        super.bark();
    }
    public Dog(int weight, int height){
        super(weight);
        this.height = height;
    }
}
