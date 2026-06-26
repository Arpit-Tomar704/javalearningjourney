package chap09_ClassesandObjects;

public class Driver {
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

    }
}
