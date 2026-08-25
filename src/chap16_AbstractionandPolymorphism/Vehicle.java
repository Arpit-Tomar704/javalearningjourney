package chap16_AbstractionandPolymorphism;

public abstract class Vehicle {
    private int nooftires;


    public   Vehicle(int nooftires) {
        this.nooftires = nooftires;
    }

    public int getNooftires() {
        return nooftires;
    }

    public void setNooftires(int nooftires) {
        this.nooftires = nooftires;
    }

    public  void commute(){
        System.out.println(")going...");
    }
}
