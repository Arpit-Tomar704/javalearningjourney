package chap06_Loops;

import java.util.Scanner;

class DoWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("please enter your age: ");
//        int age = input.nextInt();
//        while (age<0||age>100){
//            System.out.println("please enter your age: ");
//            age = input.nextInt();
//        }
        int age;
        do {
            System.out.print("please enter your age: ");
            age= input.nextInt();
        }while (age<0||age>100);
        System.out.println("your age is : " +age);



    }
}
