package Challenges;

import java.util.Scanner;

class NumberguessingGame {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the NumberrGuessingGame\n");
         int num =6,guess;
         do {
             System.out.print("please guess the number between 0 to 10:  ");
              guess = input.nextInt();
         }while (num!=guess);
         System.out.println("you successfully guess the right  number  ");

     }
}
