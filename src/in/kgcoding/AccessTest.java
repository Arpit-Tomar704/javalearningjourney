package in.kgcoding;

public class AccessTest {
    static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car .model = "Swift";
        System.out.println(car);
        Car newCar = new Car("black","swift",
                1,5000);
        System.out.println(newCar);

        Default def = new Default();


    }
}
