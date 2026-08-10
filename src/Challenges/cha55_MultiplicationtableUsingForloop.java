package Challenges;

import java.util.Scanner;

class MultiplicationtableUsingForloop {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the multiplication Table\n");
        System.out.print("Enter the number of which you want Multiplication Table:");

        int num= input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+ "x" +i+ "="+(num*i));
        }
        System.out.println("here is your Table");

    }
}
