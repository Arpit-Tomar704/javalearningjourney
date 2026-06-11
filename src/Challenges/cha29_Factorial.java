package Challenges;

import java.util.Scanner;

public class cha29_Factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the factorial of number\n");
        System.out.print("please enter the number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is "+fact);
    }
    public static  long factorial(int num ){
        if (num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i<=num){
            fact *= i;
            i++;
        }
        return fact;

    }
}
