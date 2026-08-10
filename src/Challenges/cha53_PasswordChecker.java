package Challenges;

import java.util.Scanner;

class PasswordChecker {
    static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to set  your password\n");
         String password;
         do {
             System.out.print("pls enter your password:");
             password = input.next();
         }while (!isvalidpassword(password));
         System.out.println("Thanks for entering the valid password");
     }
     public static boolean isvalidpassword(String password){
         return password.length()>=6;
     }
}
