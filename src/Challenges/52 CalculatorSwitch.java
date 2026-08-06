package Challenges;

import java.util.Scanner;

class CalculatorSwitch {
  static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to the Calculator\n");
   System.out.print("Enter your first number:  ");
   int num1 = input.nextInt();
   System.out.print("Enter your second number: ");
   int num2 = input.nextInt();
   System.out.print("Now enter the Operation: ");
    String operation = input.next();
    int result = switch (operation){
     case "+" -> num1+num2;
     case "-" -> num1-num2;
     case "*" -> num1*num2;
     case "/" -> num1/num2;
     default -> -1;

    };
   System.out.println("your answer is: " +result);


  }
}
