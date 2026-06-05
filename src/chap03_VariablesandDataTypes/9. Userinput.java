package chap03_VariablesandDataTypes;

import java.util.Scanner;

 class Topic03_Userinput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("plz Enter your Name :");
        String name = input.nextLine();
        System.out.println("good morning " + name );
        System.out.print(name + " ,Also tell me your age: ");
        int age = input.nextInt();
        System.out.println("your age is " + age );


    }
}
