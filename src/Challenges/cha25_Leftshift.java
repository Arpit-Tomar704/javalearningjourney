package Challenges;

import java.util.Scanner;

public class cha25_Leftshift {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing leftshiftoperator\n");
        System.out.print("please netr your number : ");
        int num = input.nextInt();
        int result = num <<1 ;
        System.out.println("your result is : "+result);
    }
}
