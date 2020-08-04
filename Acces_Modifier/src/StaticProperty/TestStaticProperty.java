package StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3","Skytive 3");
        System.out.println(Car.numberOfCar);
        System.out.println(car1.getName() + car1.getEngine());

        Car car2 = new Car("Mazda6","Skytive 6");
        System.out.println(Car.numberOfCar);
        System.out.println(car2.getName() + car2.getEngine());
    }
}
