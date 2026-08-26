package chap17_polymorphism;

public class TestTransportation {
    static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
       // castTest(v);
        castTest(c);

       // Vehicle vCar = new Car();
        //Car cVehicle =  (Car) new Vehicle(); aisa nii kr skte haii .

       // Object ref = new Vehicle();//object me kisi ka bhi refrence dal skte haai ..
    }

    private static  void castTest(Vehicle veh){
        Car cVehicle = (Car) veh;
        ((Car) veh).numofDoors();
        cVehicle.start();

    }
}
