package Challenges;

import java.util.Scanner;

public class cha30_sumofdigit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sum of digit of an integer ");
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        int sum = sumofdigit(num);
        System.out.println("your sum of digit  is : " +sum);
    }

    public static int sumofdigit(int num){
        int sum = 0;
        while ( num > 0 ){
            sum += num %10;
            num /= 10;

        }
        return sum;
    }

}
