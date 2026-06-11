package Challenges;

import java.util.Scanner;

public class cha27_MultiPlicationTable {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Multiplication World\n");
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        printmultiplicationtable(num);

    }public static void printmultiplicationtable(int num){
        int i =1;
        while (i<=10){
            System.out.println(num+ "X" +i +"=" +(num*i));
            i++;
        }

    }
}
