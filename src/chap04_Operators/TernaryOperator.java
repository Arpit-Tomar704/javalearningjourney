package chap04_Operators;

import java.util.Scanner;

public class TernaryOperator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the number checker\n ");
        System.out.print("please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("please enter the second number: ");
        int num2 = input.nextInt();
//        int greaterNumber;
//          if(num1>num2){
//              greaterNumber=num1;
//
//          }else{
//              greaterNumber = num2;
//
//          }
        int greaterNumber = num1>num2?num1:num2; //terinary operator usee here.
        System.out.println(greaterNumber + " is the greatest");

    }
}
