package Challenges;

import chap08_Array.Arrayutility;

import java.util.Scanner;

class PositiveNumbersContinue {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to  adding positive numbers\n");
        int[] numArr = Arrayutility.inputArray();
        int sum =0;
        for (int num:numArr){
            if (num<0){
                continue;
            }
            sum +=num;
        }
        System.out.println("the sum of positive numbers are: " +sum);
    }
}
