package StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3","Skytive 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda6","Skytive 6");
        System.out.println(Car.numberOfCar);
    }
}
