package Challenges;

import java.util.Scanner;

class ExitonExit {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while (true) {
             System.out.print("enter your command: ");
             String command = input.next();
             if (command.equalsIgnoreCase("exit")) {
                 break;

             }

         }
         System.out.println("yoou have sucessfully exited.");
     }
}
