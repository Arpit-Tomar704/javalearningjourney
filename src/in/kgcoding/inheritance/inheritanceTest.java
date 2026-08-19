package in.kgcoding.inheritance;

public class inheritanceTest {

    static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();


        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

       MotorCycle motor = new MotorCycle();
       motor.commute();
       motor.balance();
       motor.Start();


    }


}
