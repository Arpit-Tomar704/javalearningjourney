package chap09_ClassesandObjects;

public class car {
    int noofwheels;

    int numoftyre;

    float maxspeed;
    float addfuel;

    float currentfuelinlitre;

    public car start(){
        if (currentfuelinlitre==0){
            System.out.println("Car is out of fuel,Can not start ");
        } else if (currentfuelinlitre<5) {
            System.out.println("Car is in reserved mode ,please refuel ");

        }else {
            System.out.println("car is started.....bruhhhhhhhh ");

        }
        return  this;


    }


    public  void drive(){
        currentfuelinlitre--;
        System.out.println("car is driving ");



    }
    public void addfuel(float fuel ){
        currentfuelinlitre += fuel;
    }

    public float getCurrentfuellevel () {
        return currentfuelinlitre;
    }
}



