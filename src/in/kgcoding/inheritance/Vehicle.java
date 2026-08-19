package in.kgcoding.inheritance;

public class Vehicle {


    private int numberofTires;

    public void setNumberofTires(int numberofTires) {
        this.numberofTires = numberofTires;
    }

    public void commute(){
        System.out.printf("I am going from place A to place B using %d tires\n", numberofTires);
    }
}
