package Challenges;

import java.util.Scanner;

public class cha28_OddSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the sum of all odd numbers\n");
        System.out.print("enter the  number : ");
        int num = input.nextInt();
        int sum = sumofaddnumbers(num);
        System.out.println("od sum till " +num+ " is : " +sum);
    }
    public static int sumofaddnumbers(int num){
        int sum = 0;
        int i =1;
        while (i<=num){
            sum+=i;
            i += 2;

        }
        return sum;
    }
}
