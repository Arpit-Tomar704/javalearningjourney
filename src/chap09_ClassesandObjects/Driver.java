package chap09_ClassesandObjects;

public class Driver {
    static int minAgeforDriving = 18;
    String  name;
    int age;
    String Dateoflicence;

    public boolean isAllowedtoDrive(){
        return  this.age>=minAgeforDriving;
    }



    static void main(String[] args) {
//        car mycar = new car();
//        mycar.addfuel(6);
//        mycar.drive();
//        mycar.drive();
//        mycar.drive();
//        mycar.addfuel(2);
//        mycar.drive();
//        System.out.println(mycar.currentfuelinlitre);
         car swift = new car();
         swift.addfuel(6);
         swift.start().drive();

         Driver myDriver = new Driver();
         myDriver.Dateoflicence = "01/JUN/2026";
        System.out.println(minAgeforDriving);

    }
}
