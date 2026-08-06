package Challenges;

import java.util.Scanner;

class MinimumNumbers {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Minimum of Two Numbers\n");
        System.out.print("Enter your first number:  ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2= input.nextInt();
        MinimumNumbers ternary = new MinimumNumbers();
        int min = ternary.min(num1,num2);
        System.out.println("minimum number is: " +min);
    }
    public int min(int num1,int num2){
        return  num1 <num2 ?num1:num2;

    }
}
