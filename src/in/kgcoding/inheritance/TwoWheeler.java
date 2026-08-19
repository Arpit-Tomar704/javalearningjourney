package in.kgcoding.inheritance;

public class TwoWheeler extends Vehicle {

    TwoWheeler(){
        setNumberofTires(2);
     }

     public void balance(){
         System.out.println("I am balancing on two tires ");
     }

}
