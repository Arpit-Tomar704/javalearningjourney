package chap25_Enums;

public class TestingEnums {

    static void main(String[] args) {
         TrafficLight colour = TrafficLight.RED;
         colour = TrafficLight.GREEN;

         Grade grade = Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);

        }

    }


}
