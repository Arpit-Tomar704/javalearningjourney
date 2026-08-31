package Challenges94;

public class TrafficLightThread extends Thread{


    private  final TrafficColour colour;

    public TrafficLightThread(TrafficColour colour) {
        this.colour = colour;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n ",colour);
        try {
            Thread.sleep(colour.getTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n ",colour);
    }
}
