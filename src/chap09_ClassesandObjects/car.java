package chap09_ClassesandObjects;

public class car {
    String  colour;
    int numofseats;
    int noofwheels;
    int numoftyre;
    float maxspeed;
    float addfuel;
    float currentfuelinlitre;
    car(String colour){
        noofwheels=4;
      this.colour =colour ;
        maxspeed = 150;
        currentfuelinlitre = 2;
        numofseats = 5;
    }
    car(){
        this("black");
        currentfuelinlitre =5;
    }

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
    public void addfuel(float currentfuelinlitre ){
        this .currentfuelinlitre += currentfuelinlitre;
    }

    public float getCurrentfuellevel () {

        return currentfuelinlitre;
    }
}
