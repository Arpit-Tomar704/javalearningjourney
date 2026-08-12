package chap14_String;

public class Car {
    int noofWheels;
    int NoofDoors;
    int maxspeed;
    String name;
    String modelnumber;
    String company;

    public Car(int noofWheels, int noofDoors, int maxspeed, String name, String modelnumber, String company) {
        this.noofWheels = noofWheels;
        this.NoofDoors = noofDoors;
        this.maxspeed = maxspeed;
        this.name = name;
        this.modelnumber = modelnumber;
        this.company = company;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noofWheels=").append(noofWheels);
        sb.append(", NoofDoors=").append(NoofDoors);
        sb.append(", maxspeed=").append(maxspeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelnumber='").append(modelnumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    static void main(String[] args) {
        Car swift = new Car(4,4,120,
                "swift","sw876","maruti");
        System.out.println(swift.toString());

    }
}
