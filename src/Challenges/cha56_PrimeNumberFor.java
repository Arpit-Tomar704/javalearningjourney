package Challenges;

import java.util.Scanner;

class PrimeNumberFor {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the prime number Checker\n");
         System.out.print("Enterr the number: ");
         int num = input.nextInt();
         boolean isprime = isprime(num);
         System.out.println("your number is " +(isprime(num) ?"prime" :"not prime"));
     }
     public static boolean isprime(int num){
         for (int i=2;i<num;i++){
             if (num%i==0){
                 return false;
             }

         }
         return true;
     }
}
