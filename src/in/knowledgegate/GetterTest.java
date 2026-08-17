package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {

    static void main(String[] args) {
        Car car = new Car("red","maruti",3,7000);


        System.out.printf("%s %s", car.getColor(),car.getModel());
    }




}
