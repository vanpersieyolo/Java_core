package Practive1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makesound() {
        return "Chicken: cluck - cluck ";
    }

    @Override
    public String howToEat() {
        return "could be fried ";
    }
}
