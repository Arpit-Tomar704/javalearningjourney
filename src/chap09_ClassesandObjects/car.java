package chap09_ClassesandObjects;

public class car {
    int noofwheels;

    int numoftyre;

    float maxspeed;

    float currentfuelinlitre;


    public  void drive(){
        System.out.println("car is driving ");
        currentfuelinlitre --;

    }
    public void addfuel(float fuel ){
        currentfuelinlitre += fuel;
    }

    public float getCurrentfuellevel () {
        return currentfuelinlitre;
    }
}



