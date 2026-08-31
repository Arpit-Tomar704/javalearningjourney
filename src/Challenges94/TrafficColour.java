package Challenges94;

public enum TrafficColour {

    RED(9000)
    ,YELLOW(1000)
    ,GREEN(3000);

    private final  int TimeInMills;

    public int getTimeInMills() {
        return TimeInMills;
    }

    TrafficColour(int timeInMills) {
       this.TimeInMills = timeInMills;




    }
}
