package Challenges;

import java.util.Scanner;

public class cha13_Fahrenheittocelcius {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Calculator\n");
        System.out.print("Enter your temp in F: ");
        float fah = input.nextFloat();
        float cel = (fah-32)* 5.0f/9.0f;
        System.out.print("your temp  in celcius is : "+cel);
    }
}
