package in.gettersetter;

public class Car {
    private String color; //public
    private String model; //public
    private  double fuelLevel;
     private long costofpurchase;//default

    public  Car(String color, String model, double fuelLevel, long costofpurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costofpurchase = costofpurchase;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
    

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public  String getColor(){
       return color;

    }

      void setColor(String color){
        this.color = color;
    }


    public  String getModel(){
       return  model;
    }
}