package Challenges80;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Calculator\n");
        System.out.print("enter the first number: ");
        int first = input.nextInt();
        System.out.print("enter the second number: ");
        int second = input.nextInt();
        try{
            int result = first /second;
            System.out.printf("result is %d",result);
        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occured.");
            }else {
                throw exception;
            }
        }

    }
}
