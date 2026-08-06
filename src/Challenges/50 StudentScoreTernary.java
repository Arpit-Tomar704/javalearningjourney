package Challenges;

import java.util.Scanner;

class StudentScoreTernary {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlecome to the Student Score \n");
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();
        String  category = marks>80?"High":(marks>50?"Moderate":"low");
        System.out.println("your category is " +category);

    }
}
