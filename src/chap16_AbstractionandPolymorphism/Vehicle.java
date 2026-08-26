package chap16_AbstractionandPolymorphism;

public abstract class Vehicle implements Transport {
    private int nooftires;

    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("going to place...");

    }

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
        System.out.println("going...");
    }
}
