package Challenges94;

import chap25_Enums.TrafficLight;


public class RoadLight {

    static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficColour.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColour.YELLOW);
        TrafficLightThread Green = new TrafficLightThread(TrafficColour.GREEN);

        Green.start();
        Green.join();
        yellow.start();
        yellow.join();
        red.start();
    }



}
