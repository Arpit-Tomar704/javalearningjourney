package in.kgcoding;

public class Car {
    public String color;
    public String model;
    private  double fuelLevel;
     long costofpurchase;

    public Car(){

    }


    public Car(String color, String model, double  fuelLevel, long costofpurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costofpurchase = costofpurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", costofpurchase=").append(costofpurchase);
        sb.append('}');
        return sb.toString();
    }
}
