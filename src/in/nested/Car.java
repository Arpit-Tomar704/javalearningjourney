package in.nested;

public class Car {
    private int noofDoors;

    public void repair(){
        Tire t = new Tire();

    }
    public static  class Tire{ //in nested class we can make one more inside the main class in the same
        // program and it can be protected,public,and default(ineer class).
         private double width;
         private double pressure;
         private String material;
    }
}
